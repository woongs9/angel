package com.toilet.urgent.repository;



import com.toilet.urgent.entity.Toilet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToiletRepository extends JpaRepository<Toilet, Integer> {
    List<Toilet> findByAll();
}
