package csse.service;


import csse.entity.User;

public interface UserService {

    User userLogin(String id, String password);

    double checkBalance(String id);

    boolean checkUserNameIsExists(String userName);
}
