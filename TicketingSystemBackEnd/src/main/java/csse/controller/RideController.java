package csse.controller;

import csse.entity.Ride;
import csse.service.RideService;
import csse.util.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = CommonConstants.ROUTE_RIDE_MAIN)
public class RideController {


    @Autowired
    private RideService rideService;

    @GetMapping(value = CommonConstants.ROUTE_CREATE_RIDE)
    public Ride addRide(@PathVariable String tokenNumber, @PathVariable String busNumber,
                        @PathVariable String latitude, @PathVariable String longitude) {
        return rideService.addRide(tokenNumber, busNumber, latitude, longitude);
    }

    @PostMapping(value = CommonConstants.ROUTE_CREATE)
    public Ride updateRide(@RequestBody Ride ride) {
        return rideService.updateRide(ride);
    }

    @GetMapping(value = CommonConstants.ROUTE_RIDE_AMOUNT)
    public double getRideAmountBetweenTwoDistance(@PathVariable String fromLocation, @PathVariable String toLocation,
                                                  @PathVariable String date) {
        String year = date.substring(0, 4);
        String month = date.substring(5, 7);
        String day = date.substring(8, 10);
        String newDate = day + "/" + month + "/" + year;
        return rideService.getRideAmountBetweenTwoDistance(fromLocation, toLocation, newDate);
    }
}
