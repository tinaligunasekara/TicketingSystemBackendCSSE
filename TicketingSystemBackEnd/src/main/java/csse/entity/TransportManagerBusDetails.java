package csse.entity;

import javax.persistence.*;


@Entity
public class TransportManagerBusDetails extends DateTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transportMangerBusDetailId;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private TransportManager transportManger;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Bus bus;


    public int getTransportMangerBusDetailId() {
        return transportMangerBusDetailId;
    }

    public void setTransportMangerBusDetailId(int transportMangerBusDetailId) {
        this.transportMangerBusDetailId = transportMangerBusDetailId;
    }

    public TransportManager getTransportManger() {
        return transportManger;
    }

    public void setTransportManger(TransportManager transportManger) {
        this.transportManger = transportManger;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }


}
