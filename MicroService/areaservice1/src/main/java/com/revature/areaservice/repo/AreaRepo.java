package com.revature.areaservice.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.areaservice.model.Area;

@Repository
public interface AreaRepo extends JpaRepository<Area, Integer>{

	@Query("FROM Area a WHERE a.name = ?1")
	Optional<Area> findByName(String name);
	
	
    
}
