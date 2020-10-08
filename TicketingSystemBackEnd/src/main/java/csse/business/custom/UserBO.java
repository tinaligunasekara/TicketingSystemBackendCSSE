package csse.business.custom;

import csse.business.SuperBO;

public interface UserBO extends SuperBO {

    String userLogin(String id, String password);

    double checkBalance(String id);

    boolean checkUserNameIsExists(String userName);
}
