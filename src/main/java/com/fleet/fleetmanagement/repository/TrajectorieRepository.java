package  com.fleet.fleetmanagement.repository;

import com.fleet.fleetmanagement.models.Trajectories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface TrajectorieRepository extends JpaRepository<Trajectories, Integer> {
    @Query(value = "SELECT * FROM trajectories t WHERE t.taxi_id = :taxi_id", nativeQuery = true)
    List<Trajectories> listTrajectories(@Param("taxi_id") Integer taxi_id);
}
