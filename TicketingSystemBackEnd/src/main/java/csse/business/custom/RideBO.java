package csse.business.custom;

import csse.business.SuperBO;
import csse.entity.Ride;

public interface RideBO extends SuperBO {
    Ride addRide(String tokenNumber, String busNumber, String latitude, String longitude);

    Ride updateRide(Ride ride);
}
