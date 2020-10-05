package csse.service;

import csse.entity.User;

import java.util.List;

public interface LocalUserService {

    User addLocalUser(User user);

    List<User> getAllLocalUsers();

    User getAllLocalUsersById(String id);

}
