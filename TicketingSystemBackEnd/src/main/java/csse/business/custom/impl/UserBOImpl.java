package csse.business.custom.impl;

import csse.business.custom.UserBO;
import csse.entity.User;
import csse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserBOImpl implements UserBO {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User userLogin(String id, String password) {
        User userId = userRepository.userLogin(id, password);
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
        return result;
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


}
