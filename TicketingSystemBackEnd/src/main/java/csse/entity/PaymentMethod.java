package csse.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
public class PaymentMethod extends DateTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentMethodId;
    private String cardHoldersName;
    private String cardNumber;
    private String expiredDate;
    private String cvcNumber;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private LocalUser localUser;


    public int getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getCardHoldersName() {
        return cardHoldersName;
    }

    public void setCardHoldersName(String cardHoldersName) {
        this.cardHoldersName = cardHoldersName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getCvcNumber() {
        return cvcNumber;
    }

    public void setCvcNumber(String cvcNumber) {
        this.cvcNumber = cvcNumber;
    }

    public LocalUser getLocalUser() {
        return localUser;
    }

    public void setLocalUser(LocalUser localUser) {
        this.localUser = localUser;
    }
}
