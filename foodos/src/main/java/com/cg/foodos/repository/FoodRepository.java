package com.cg.foodos.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.foodos.dto.Food;

/**
 * 
 */
@Repository
public interface FoodRepository extends JpaRepository<Food, Integer> {

}