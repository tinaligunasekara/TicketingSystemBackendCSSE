package csse.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

import java.util.Set;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;
    private String status;
    private double amount;
    private String method;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "payment")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Set<TransportManagerPaymentDetails> transportManagerPaymentDetails;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private LocalUser localUser;


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
