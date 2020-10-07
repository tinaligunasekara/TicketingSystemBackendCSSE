package csse.repository;

import csse.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select nic from User where userName =?1 and password=?2")
    String userLogin(String id, String password);
}
