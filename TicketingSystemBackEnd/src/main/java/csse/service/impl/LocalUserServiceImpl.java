package csse.service.impl;

import csse.business.BOFactory;
import csse.business.custom.LocalUserBO;
import csse.entity.User;
import csse.repository.UserRepository;
import csse.service.LocalUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalUserServiceImpl implements LocalUserService {

    @Autowired
    private LocalUserBO localUserBO;
//    @Autowired
//    private UserRepository userRepository;

    public LocalUserServiceImpl() {
        localUserBO = (LocalUserBO) BOFactory.getInstance().getBO(BOFactory.BoTypes.LOCAL_USER_BO);
    }

    @Override
    public User addLocalUser(User user) {
//        System.out.println("GGGGLLLLLLLLLL");
//        localUserBO.displayMetho();
        return localUserBO.addLocalUser(user);
//        return userRepository.save(user);
    }
}
