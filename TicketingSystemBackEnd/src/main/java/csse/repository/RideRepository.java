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

    @Query(value = "select round(sum(r.payment)),r.cur_date " +
            "from ride r where from_location Like CONCAT('%',:fromLocation,'%') " +
            "and to_location Like CONCAT('%',:toLocation,'%') and cur_date =:curDate " +
            "group by r.cur_date ",nativeQuery = true)
    List<Object[]> getRideAmountBetweenTwoDistance(@Param("fromLocation")String fromLocation,
                                                   @Param("toLocation")String toLocation,
                                                   @Param("curDate") String curDate);
}
