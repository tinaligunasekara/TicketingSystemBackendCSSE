package csse.entity;


import javax.persistence.*;


@Entity
public class User extends DateTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
    private String password;
    private String email;
    private String role;
    private String nic;
    private String address;
    private double accountBalance;
    private String userName;
    private String tokenNumber;
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
    private Conductor conductor;



    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        foreigner.setUser(this);
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

    public String getTokenNumber() {
        return tokenNumber;
    }

    public void setTokenNumber(String tokenNumber) {
        this.tokenNumber = tokenNumber;
    }
}
