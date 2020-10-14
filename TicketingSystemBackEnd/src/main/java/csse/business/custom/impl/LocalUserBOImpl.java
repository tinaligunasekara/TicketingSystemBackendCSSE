package csse.business.custom.impl;

import csse.business.custom.LocalUserBO;
import csse.entity.User;
import csse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class LocalUserBOImpl implements LocalUserBO {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public User addLocalUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllLocalUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getAllLocalUsersById(String id) {
        return null;
    }

}
