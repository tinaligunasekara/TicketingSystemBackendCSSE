package csse.service.impl;

import csse.business.BOFactory;
import csse.business.custom.UserBO;
import csse.entity.User;
import csse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserBO userBO;

    public UserServiceImpl(){
        userBO = (UserBO) BOFactory.getInstance().getBO(BOFactory.BoTypes.USER);

    }

    @Override
    public User userLogin(String id, String password) {
        return userBO.userLogin(id,password);
    }

    @Override
    public double checkBalance(String id) {
        return userBO.checkBalance(id);
    }

    @Override
    public boolean checkUserNameIsExists(String userName) {
        return userBO.checkUserNameIsExists(userName);
    }

    @Override
    public User updatePayment(String amount, String tokenNumber) {
        return userBO.updatePayment(amount,tokenNumber);
    }
}
