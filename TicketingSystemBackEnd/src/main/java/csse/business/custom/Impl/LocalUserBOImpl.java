package csse.business.custom.Impl;

import csse.business.custom.LocalUserBO;
import csse.entity.User;
import csse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LocalUserBOImpl implements LocalUserBO {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addLocalUser(User user) {
        return userRepository.save(user);
    }

}
