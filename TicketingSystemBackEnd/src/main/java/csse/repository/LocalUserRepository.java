package csse.repository;

import csse.entity.Foreigner;
import csse.entity.LocalUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalUserRepository extends JpaRepository<LocalUser, Integer> {
}
