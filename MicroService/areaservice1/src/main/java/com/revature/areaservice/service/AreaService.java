package com.revature.areaservice.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.areaservice.model.Area;
import com.revature.areaservice.repo.AreaRepo;

@Service
public class AreaService {

	private AreaRepo areaRepo;

	@Autowired
	public AreaService(AreaRepo areaRepo) {
		super();
		this.areaRepo = areaRepo;
	}

	public List<Area> findAll() {
		return this.areaRepo.findAll();
	}

	public Area findById(int id) {
		try {
			return areaRepo.findById(id).get();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return null;
		}
	}
}
