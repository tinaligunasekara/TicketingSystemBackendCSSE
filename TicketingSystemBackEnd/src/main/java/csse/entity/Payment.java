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
public class Payment extends SuperEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;
    private String status;
    private double amount;
    private String method;
    private String curDate;
    private String curTime;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "payment")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Set<TransportManagerPaymentDetails> transportManagerPaymentDetails;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private LocalUser localUser;

    public Payment() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        Date date = new Date();
        curTime = dtf.format(now);
        curDate = formatter.format(date);
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
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

    public Set<TransportManagerPaymentDetails> getTransportManagerPaymentDetails() {
        return transportManagerPaymentDetails;
    }

    public void setTransportManagerPaymentDetails(Set<TransportManagerPaymentDetails> transportManagerPaymentDetails) {
        this.transportManagerPaymentDetails = transportManagerPaymentDetails;
    }

    public LocalUser getLocalUser() {
        return localUser;
    }

    public void setLocalUser(LocalUser localUser) {
        this.localUser = localUser;
    }
}
