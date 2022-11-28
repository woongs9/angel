package com.toilet.urgent.repository;



import com.toilet.urgent.entity.Toilet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ToiletRepository extends JpaRepository<Toilet, Integer> {
    @Query(value = "SELECT *, (6371 * acos (cos ( radians(:lat) ) * cos( radians( latitude ) ) * cos( radians( longitude ) - radians(:lon) ) + sin( radians(:lat) ) * sin( radians( latitude ) ))) AS distance FROM toilet order by distance", nativeQuery = true)
    public List<Toilet> selectAllSQL(String lat, String lon);
}
