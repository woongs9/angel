package com.toilet.urgent.repository;



import com.toilet.urgent.entity.Toilet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ToiletRepository extends JpaRepository<Toilet, Integer> {
    @Query(value = "SELECT *, (6371 * acos (cos ( radians(37.474134) ) * cos( radians( latitude ) ) * cos( radians( longitude ) - radians(127.030902) ) + sin( radians(37.474134) ) * sin( radians( latitude ) ))) AS distance FROM toilet order by distance", nativeQuery = true)
    public List<Toilet> selectAllSQL();
}
