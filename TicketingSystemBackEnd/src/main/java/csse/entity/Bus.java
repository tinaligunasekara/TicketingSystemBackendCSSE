package csse.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Bus extends DateTime{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int busId;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private Conductor conductor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bus")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Set<TransportManagerBusDetails> transportManagerBusDetails;

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Set<TransportManagerBusDetails> getTransportManagerBusDetails() {
        return transportManagerBusDetails;
    }

    public void setTransportManagerBusDetails(Set<TransportManagerBusDetails> transportManagerBusDetails) {
        this.transportManagerBusDetails = transportManagerBusDetails;
    }
}
