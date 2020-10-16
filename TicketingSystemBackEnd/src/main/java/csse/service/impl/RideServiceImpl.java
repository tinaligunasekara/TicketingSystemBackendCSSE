package csse.service.impl;

import csse.business.BOFactory;
import csse.business.custom.RideBO;
import csse.entity.Ride;
import csse.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {

    @Autowired
    private RideBO rideBO;
    public RideServiceImpl() {
        rideBO = (RideBO) BOFactory.getInstance().getBO(BOFactory.BoTypes.RIDE_BO);

    }

    @Override
    public Ride addRide(String tokenNumber, String busNumber, String latitude, String longitude) {
        return rideBO.addRide(tokenNumber,busNumber,latitude,longitude);
    }

    @Override
    public Ride updateRide(Ride ride) {
        return rideBO.updateRide(ride);
    }
}
