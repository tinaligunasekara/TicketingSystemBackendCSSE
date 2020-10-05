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
public class Foreigner extends SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int foreignerId;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private User user;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "foreigner")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Set<ForeignerInspecterDetails> foreignerInspecterDetails;
    private String curDate;
    private String curTime;

    public Foreigner() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        Date date = new Date();
        this.curTime = dtf.format(now);
        this.curDate = formatter.format(date);
    }

    public int getForeignerId() {
        return foreignerId;
    }

    public void setForeignerId(int foreignerId) {
        this.foreignerId = foreignerId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Set<ForeignerInspecterDetails> getForeignerInspecterDetails() {
        return foreignerInspecterDetails;
    }

    public void setForeignerInspecterDetails(Set<ForeignerInspecterDetails> foreignerInspecterDetails) {
        this.foreignerInspecterDetails = foreignerInspecterDetails;
    }
}
