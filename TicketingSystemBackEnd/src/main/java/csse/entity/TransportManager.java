package csse.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TransportManager extends DateTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transportManagerId;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private User user;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transportManger")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Set<TransportManagerPaymentDetails> transportManagerPaymentDetails;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transportManger")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Set<TransportManagerBusDetails> transportManagerBusDetails;



    public int getTransportManagerId() {
        return transportManagerId;
    }

    public void setTransportManagerId(int transportManagerId) {
        this.transportManagerId = transportManagerId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
