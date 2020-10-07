package csse.entity;

import javax.persistence.*;
@Entity
public class InspecterLocalUserDetails extends DateTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int busTransportManagerDetailId;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private LocalUser localUser;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Inspecter inspecter;


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


}
