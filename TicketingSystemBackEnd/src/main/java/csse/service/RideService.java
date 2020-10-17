package csse.service;

import csse.entity.Ride;

public interface RideService {
    Ride addRide(String tokenNumber, String busNumber, String latitude, String longitude);

    Ride updateRide(Ride ride);

    double getRideAmountBetweenTwoDistance(String fromLocation, String toLocation, String date);

}
