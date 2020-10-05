package csse.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Set;

@Entity
public class User extends SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
    private String password;
    private String email;
    private String role;
    private String nic;
    private String address;
    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Foreigner foreigner ;
    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Inspecter inspecter ;
    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private LocalUser localUser ;
    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private TransportManager transportManager ;
    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Conductor conductor ;
    private String curDate;
    private String curTime;

    public User() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        Date date = new Date();
        this.curTime = dtf.format(now);
        this.curDate = formatter.format(date);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public LocalUser getLocalUser() {

        return localUser;
    }

    public void setLocalUser(LocalUser localUser) {
        localUser.setUser(this);
        this.localUser = localUser;
    }

    public TransportManager getTransportManager() {
        return transportManager;
    }

    public void setTransportManager(TransportManager transportManager) {
        this.transportManager = transportManager;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
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
}
