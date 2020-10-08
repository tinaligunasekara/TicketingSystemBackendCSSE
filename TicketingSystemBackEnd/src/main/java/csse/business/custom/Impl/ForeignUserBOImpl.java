package csse.business.custom.impl;

import csse.business.custom.ForeignUserBO;
import csse.entity.User;
import csse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ForeignUserBOImpl implements ForeignUserBO {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addForeignUser(User user) {
        return userRepository.save(user);
    }
}
