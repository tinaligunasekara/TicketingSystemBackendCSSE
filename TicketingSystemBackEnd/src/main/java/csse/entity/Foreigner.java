package csse.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

import java.util.Set;

@Entity
public class Foreigner extends DateTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int foreignerId;
    private String passportNumber;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private User user;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "foreigner")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Set<ForeignerInspecterDetails> foreignerInspecterDetails;


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


    public Set<ForeignerInspecterDetails> getForeignerInspecterDetails() {
        return foreignerInspecterDetails;
    }

    public void setForeignerInspecterDetails(Set<ForeignerInspecterDetails> foreignerInspecterDetails) {
        this.foreignerInspecterDetails = foreignerInspecterDetails;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

}
