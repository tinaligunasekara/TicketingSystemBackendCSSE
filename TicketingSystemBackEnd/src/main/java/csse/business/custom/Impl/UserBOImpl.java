package csse.business.custom.Impl;

import csse.business.custom.UserBO;
import csse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserBOImpl implements UserBO {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean userLogin(String id, String password) {
        String userId = userRepository.userLogin(id, password);
        boolean result = true;
        if (userId == null) {
            result = false;
        }
        return result;
    }
}
