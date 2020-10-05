package csse.entity;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
public class TransportManagerBusDetails extends SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transportMangerBusDetailId;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private TransportManager transportManger;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Bus bus;
    private String curDate;
    private String curTime;

    public TransportManagerBusDetails() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        Date date = new Date();
        curTime = dtf.format(now);
        curDate = formatter.format(date);
    }

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

    public String getCurDate() {
        return curDate;
    }

    public void setCurDate(String curDate) {
        this.curDate = curDate;
    }

    public String getCurTime() {
        return curTime;
    }

    public void setCurTime(String curTime) {
        this.curTime = curTime;
    }
}
