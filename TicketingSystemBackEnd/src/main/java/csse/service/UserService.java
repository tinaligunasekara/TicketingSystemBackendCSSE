package csse.service;


public interface UserService {

    String userLogin(String id, String password);

    double checkBalance(String id);

    boolean checkUserNameIsExists(String userName);
}
