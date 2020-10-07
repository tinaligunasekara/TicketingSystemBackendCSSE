package csse.entity;

import javax.persistence.*;


@Entity
public class TransportManagerPaymentDetails extends DateTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int busTransportManagerDetailId;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private TransportManager transportManger;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Payment payment;



    public int getBusTransportManagerDetailId() {
        return busTransportManagerDetailId;
    }

    public void setBusTransportManagerDetailId(int busTransportManagerDetailId) {
        this.busTransportManagerDetailId = busTransportManagerDetailId;
    }

    public TransportManager getTransportManger() {
        return transportManger;
    }

    public void setTransportManger(TransportManager transportManger) {
        this.transportManger = transportManger;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }


}
