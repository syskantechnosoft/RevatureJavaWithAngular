package com.revature.roomservice.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.roomservice.model.Area;
import com.revature.roomservice.model.Room;
import com.revature.roomservice.service.RoomService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/room")
public class RoomController {

	private RoomService roomService;
	
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	public RoomController(RoomService roomService) {
		super();
		this.roomService = roomService;
	}

	@GetMapping
	public ResponseEntity<List<Room>> allRooms() {
		List<Room> rooms = roomService.findAll();
		if (rooms.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(rooms);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Room> findById(@PathVariable("id") int id) {
		Room room = roomService.findById(id);
		if (Objects.isNull(room)) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(room);
	}

	@GetMapping("/area/{name}")
	public ResponseEntity<Area> findByAreaName(@PathVariable String name) {
		Area area = roomService.findbyName(name);
		if (Objects.isNull(area)) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(area);

	}
	
	
	@GetMapping("/roombyarea/{name}")
	public ResponseEntity<List<Room>> findRoomByAreaName(@PathVariable String name) {
		Area area = roomService.findbyName(name);
		List<Room> room = roomService.findRoomByArea(area);
		if (Objects.isNull(room)) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(room);

	}
}
