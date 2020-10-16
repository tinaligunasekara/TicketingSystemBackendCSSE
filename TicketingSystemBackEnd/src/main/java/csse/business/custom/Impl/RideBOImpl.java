package csse.business.custom.impl;

import csse.business.custom.RideBO;
import csse.entity.DateTime;
import csse.entity.Ride;
import csse.entity.User;
import csse.repository.RideRepository;
import csse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Component
public class RideBOImpl implements RideBO {

    @Autowired
    private RideRepository rideRepository;
    @Autowired
    private DateTime dateTime;
    @Autowired
    private UserRepository userRepository;

    @Override
    public Ride addRide(String tokenNumber, String busNumber, String latitude, String longitude) {

        String date = dateTime.getCurDate();
        String status = rideRepository.checkRowAccordingToTokenNumber(tokenNumber, date);
        Ride ride = new Ride();
        ride.setBusNumber(busNumber);
        ride.setTokenNumber(tokenNumber);
        if (status == null || status.equalsIgnoreCase("Out")) {
            ride.setPassengerQuantity(1);
            ride.setRideId(0);
            ride.setPayment(0);
            ride.setStatus("In");
            ride.setInlat(latitude);
            ride.setInLong(longitude);
            return saveRide(ride);
        } else if (status.equalsIgnoreCase("In")) {
            List<Object[]> ride_id = rideRepository.getRideIdAccordingToTokenNumber(tokenNumber, date);
            for (Object o[]: ride_id
            ) {
                ride.setRideId(Integer.parseInt(o[0].toString().trim()));
                ride.setBusNumber(o[1].toString());
                ride.setInLong(o[2].toString());
                ride.setInlat(o[3].toString());
            }
            ride.setOutLat(latitude);
            ride.setOutLong(longitude);
            ride.setStatus("Out");
            return saveRide(ride);
        } else {
            return null;
        }

    }

    @Transactional
    @Override
    public Ride updateRide(Ride ride) {
        Ride result = saveRide(ride);
        if(result!=null){
            User user = userRepository.getUserByTokenNumber(result.getTokenNumber());
            double newBalance = user.getAccountBalance()-result.getPayment();
            user.setAccountBalance(newBalance);
            userRepository.save(user);
        }
        return result;
    }


    public Ride saveRide(Ride ride) {
        return rideRepository.save(ride);
    }
}
