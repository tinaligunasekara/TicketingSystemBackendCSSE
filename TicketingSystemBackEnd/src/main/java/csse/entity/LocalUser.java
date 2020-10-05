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
public class LocalUser extends SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int localUserId;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private User user;
    private String curDate;
    private String curTime;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "localUser")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Set<Payment> payment;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "localUser")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Set<InspecterLocalUserDetails> inspecterLocalUserDetails;

    public LocalUser() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        Date date = new Date();
        this.curTime = dtf.format(now);
        this.curDate = formatter.format(date);
    }

    public int getLocalUserId() {
        return localUserId;
    }

    public void setLocalUserId(int localUserId) {
        this.localUserId = localUserId;
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

    public Set<Payment> getPayment() {
        return payment;
    }

    public void setPayment(Set<Payment> payment) {
        this.payment = payment;
    }

    public Set<InspecterLocalUserDetails> getInspecterLocalUserDetails() {
        return inspecterLocalUserDetails;
    }

    public void setInspecterLocalUserDetails(Set<InspecterLocalUserDetails> inspecterLocalUserDetails) {
        this.inspecterLocalUserDetails = inspecterLocalUserDetails;
    }
}
