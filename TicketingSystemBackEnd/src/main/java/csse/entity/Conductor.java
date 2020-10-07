package csse.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
public class Conductor extends DateTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int conductorId;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private User user;
    @OneToOne(mappedBy = "conductor", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonIgnore
    private Bus bus ;


    public int getConductorId() {
        return conductorId;
    }

    public void setConductorId(int conductorId) {
        this.conductorId = conductorId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
}
