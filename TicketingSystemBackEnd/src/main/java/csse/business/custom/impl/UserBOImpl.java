package csse.business.custom.impl;

import csse.business.custom.UserBO;
import csse.entity.User;
import csse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;

@Component
public class UserBOImpl implements UserBO {

    @Autowired
    private UserRepository userRepository;
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    @Override
    public User userLogin(String id, String password) {
        User userId = userRepository.userLogin(id, password);
        System.out.println(userId);
        User result = userId;
        if (userId == null) {
            result = null;
        }
        return result;
    }

    @Override
    public double checkBalance(String id) {
        String value = userRepository.checkBalance(id);
        double result =0;
        if(value!=null)
            result =Double.parseDouble(value.trim());
        return Double.parseDouble(df2.format(result));
    }

    @Override
    public boolean checkUserNameIsExists(String userName) {
        String user = userRepository.checkUserNameIsExists(userName);
        boolean result = false;
        if(user!=null){
            result = true;
        }
        return result;
    }

    @Override
    public User updatePayment(String amount, String tokenNumber) {
        User user = userRepository.getUserByTokenNumber(tokenNumber);
        double newBalance = user.getAccountBalance()+Double.parseDouble(amount.trim());
        user.setAccountBalance(newBalance);
        return userRepository.save(user);
    }


}
