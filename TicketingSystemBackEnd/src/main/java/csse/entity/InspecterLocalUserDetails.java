package csse.entity;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
@Entity
public class InspecterLocalUserDetails extends SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int busTransportManagerDetailId;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private LocalUser localUser;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Inspecter inspecter;
    private String curDate;
    private String curTime;

    public InspecterLocalUserDetails() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        Date date = new Date();
        curTime = dtf.format(now);
        curDate = formatter.format(date);
    }

    public int getBusTransportManagerDetailId() {
        return busTransportManagerDetailId;
    }

    public void setBusTransportManagerDetailId(int busTransportManagerDetailId) {
        this.busTransportManagerDetailId = busTransportManagerDetailId;
    }

    public LocalUser getLocalUser() {
        return localUser;
    }

    public void setLocalUser(LocalUser localUser) {
        this.localUser = localUser;
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
