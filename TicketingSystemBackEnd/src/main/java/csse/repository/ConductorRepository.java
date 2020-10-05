package csse.repository;

import csse.entity.Foreigner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConductorRepository extends JpaRepository<Foreigner, Integer> {

}
