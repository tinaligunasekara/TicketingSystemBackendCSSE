package csse.repository;

import csse.entity.Foreigner;
import csse.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForeignerRepository extends JpaRepository<Foreigner, Integer> {
}
