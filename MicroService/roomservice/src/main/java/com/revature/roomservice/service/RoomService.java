package com.revature.roomservice.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//import com.revature.repos.AreaRepo;
import com.revature.roomservice.model.Area;
import com.revature.roomservice.model.Room;
import com.revature.roomservice.repo.RoomRepo;

@Service
public class RoomService {

	@Autowired
    private RoomRepo roomRepo;
	
	@Autowired
	private RestTemplate restTemplate;
//	private AreaRepo areaRepo;

    @Autowired
    public RoomService(RoomRepo roomRepo){
        super();
        this.roomRepo = roomRepo;
    }

    public List<Room> findAll(){
        return roomRepo.findAll();
    }

    public Room findById(int id){
        try{
            return roomRepo.findById(id).get();
        } catch (NoSuchElementException e){
            e.printStackTrace();
            return null;
        }
       
    }
    
    public Area findbyName(String name) {
    	return restTemplate.getForObject("http://localhost:8093/area/name/"+name, Area.class);
    }
    
    public List<Room> findRoomByArea(Area area) {
    	return roomRepo.findByArea(area);
    }
    
}
