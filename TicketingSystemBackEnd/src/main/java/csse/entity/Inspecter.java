package csse.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

import java.util.Set;

@Entity
public class Inspecter extends DateTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int inspecterId;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private User user;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inspecter")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Set<ForeignerInspecterDetails> foreignerInspecterDetails;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inspecter")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Set<InspecterLocalUserDetails> inspecterLocalUserDetails;



    public int getInspecterId() {
        return inspecterId;
    }

    public void setInspecterId(int inspecterId) {
        this.inspecterId = inspecterId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
