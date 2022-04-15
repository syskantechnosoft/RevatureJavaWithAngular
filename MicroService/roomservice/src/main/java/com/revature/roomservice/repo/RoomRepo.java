package com.revature.roomservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.roomservice.model.Area;
import com.revature.roomservice.model.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Integer> {
	@Query("FROM Room r WHERE r.area = ?1")
	public List<Room> findByArea(Area area);
}
