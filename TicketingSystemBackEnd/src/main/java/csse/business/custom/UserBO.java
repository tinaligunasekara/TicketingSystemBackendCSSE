package csse.business.custom;

import csse.business.SuperBO;
import csse.entity.User;

public interface UserBO extends SuperBO {

    User userLogin(String id, String password);

    double checkBalance(String id);

    boolean checkUserNameIsExists(String userName);

    User updatePayment(String amount, String tokenNumber);
}
