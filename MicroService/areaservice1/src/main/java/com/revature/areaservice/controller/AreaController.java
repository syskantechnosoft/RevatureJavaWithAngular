package com.revature.areaservice.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.areaservice.model.Area;
import com.revature.areaservice.service.AreaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/area")
public class AreaController {
    
    private AreaService areaService;

    @Autowired
    public AreaController(AreaService areaService){
        super();
        this.areaService = areaService;
    }

    @GetMapping
    public List<Area> allAreas(){
        return areaService.findAll();
    }

    @GetMapping("/{id}")
    public Area findById(@PathVariable("id") int id){
        return areaService.findById(id);
    }

}
