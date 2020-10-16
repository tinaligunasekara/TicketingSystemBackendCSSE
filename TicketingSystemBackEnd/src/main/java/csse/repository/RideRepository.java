package csse.repository;

import csse.entity.Ride;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Primary
public interface RideRepository extends JpaRepository<Ride, Integer> {

    @Query(value = "select  status from ride where cur_date =:curdate and token_number =:tokenNumber " +
                   "order by ride_id desc limit 1",nativeQuery = true)
    String checkRowAccordingToTokenNumber(@Param("tokenNumber")String tokenNumber,@Param("curdate") String date);

    @Query(value = "select ride_id,bus_number,in_long,inlat " +
                   "from ride where cur_date =:curdate and token_number =:tokenNumber " +
                   "order by ride_id desc limit 1 ",nativeQuery = true)
    List<Object[]> getRideIdAccordingToTokenNumber(@Param("tokenNumber")String tokenNumber, @Param("curdate") String date);
}
