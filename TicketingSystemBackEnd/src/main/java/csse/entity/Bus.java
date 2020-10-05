package csse.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Set;

@Entity
public class Bus extends SuperEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int busId;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private Conductor conductor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bus")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Set<TransportManagerBusDetails> transportManagerBusDetails;

    private String curDate;
    private String curTime;

    public Bus() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        Date date = new Date();
        this.curTime = dtf.format(now);
        this.curDate = formatter.format(date);
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
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

    public Set<TransportManagerBusDetails> getTransportManagerBusDetails() {
        return transportManagerBusDetails;
    }

    public void setTransportManagerBusDetails(Set<TransportManagerBusDetails> transportManagerBusDetails) {
        this.transportManagerBusDetails = transportManagerBusDetails;
    }
}
