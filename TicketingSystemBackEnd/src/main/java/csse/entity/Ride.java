package csse.entity;



import javax.persistence.*;


@Entity
public class Ride extends DateTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rideId;
    private String tokenNumber;
    private int passengerQuantity;
    private String busNumber;
    private String inlat;
    private String inLong;
    private String outLat;
    private String outLong;
    private double payment;
    private double distance;
    private String status;
    private String toLocation;
    private String fromLocation;


    public int getRideId(){
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    public String getTokenNumber() {
        return tokenNumber;
    }

    public void setTokenNumber(String tokenNumber) {
        this.tokenNumber = tokenNumber;
    }

    public int getPassengerQuantity() {
        return passengerQuantity;
    }

    public void setPassengerQuantity(int passengerQuantity) {
        this.passengerQuantity = passengerQuantity;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getInlat() {
        return inlat;
    }

    public void setInlat(String inlat) {
        this.inlat = inlat;
    }

    public String getInLong() {
        return inLong;
    }

    public void setInLong(String inLong) {
        this.inLong = inLong;
    }

    public String getOutLat() {
        return outLat;
    }

    public void setOutLat(String outLat) {
        this.outLat = outLat;
    }

    public String getOutLong() {
        return outLong;
    }

    public void setOutLong(String outLong) {
        this.outLong = outLong;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }
}
