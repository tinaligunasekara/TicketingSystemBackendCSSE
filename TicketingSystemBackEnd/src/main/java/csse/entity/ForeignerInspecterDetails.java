package csse.entity;

import javax.persistence.*;


@Entity
public class ForeignerInspecterDetails extends DateTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int busTransportManagerDetailId;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Foreigner foreigner;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Inspecter inspecter;


    public int getBusTransportManagerDetailId() {
        return busTransportManagerDetailId;
    }

    public void setBusTransportManagerDetailId(int busTransportManagerDetailId) {
        this.busTransportManagerDetailId = busTransportManagerDetailId;
    }

    public Foreigner getForeigner() {
        return foreigner;
    }

    public void setForeigner(Foreigner foreigner) {
        this.foreigner = foreigner;
    }

    public Inspecter getInspecter() {
        return inspecter;
    }

    public void setInspecter(Inspecter inspecter) {
        this.inspecter = inspecter;
    }


}
