package csse.entity;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
public class ForeignerInspecterDetails extends SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int busTransportManagerDetailId;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Foreigner foreigner;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Inspecter inspecter;
    private String curDate;
    private String curTime;

    public ForeignerInspecterDetails() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        Date date = new Date();
        this.curTime = dtf.format(now);
        this.curDate = formatter.format(date);
    }

    public int getBusTransportManagerDetailId() {
        return busTransportManagerDetailId;
    }

    public void setBusTransportManagerDetailId(int busTransportManagerDetailId) {
        this.busTransportManagerDetailId = busTransportManagerDetailId;
    }

    public Foreigner getForeigner() {
        return foreigner;
    }

    public void setForeigner(Foreigner foreigner) {
        this.foreigner = foreigner;
    }

    public Inspecter getInspecter() {
        return inspecter;
    }

    public void setInspecter(Inspecter inspecter) {
        this.inspecter = inspecter;
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
