package csse.repository;

import csse.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(" from User where userName =?1 and password=?2")
    User userLogin(String id, String password);

    @Query("select accountBalance from User where nic =?1")
    String checkBalance(String id);

    @Query("select nic from User where userName =?1")
    String checkUserNameIsExists(String userName);

}
