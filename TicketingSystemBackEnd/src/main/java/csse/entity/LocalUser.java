package csse.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Set;

@Entity
public class LocalUser extends DateTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int localUserId;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private User user;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "localUser")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Set<Payment> payment;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "localUser")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Set<InspecterLocalUserDetails> inspecterLocalUserDetails;
    @OneToOne(mappedBy = "localUser", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private PaymentMethod paymentMethod;


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

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        paymentMethod.setLocalUser(this);
        this.paymentMethod = paymentMethod;
    }


}
