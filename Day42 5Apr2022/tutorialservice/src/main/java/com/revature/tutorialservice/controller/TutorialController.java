package com.revature.tutorialservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.tutorialservice.model.Tutorial;
import com.revature.tutorialservice.service.TutorialService;

@RestController
@RequestMapping("/api")

@CrossOrigin(origins = "http://localhost:4200")
public class TutorialController {

	@Autowired
	TutorialService tutorialService;
	
	@GetMapping("/tutorials")
	public List<Tutorial> findAll() {
		// TODO Auto-generated method stub
		return tutorialService.findAll();
	}

	@GetMapping("/tutorials/{id}")
	public Tutorial findById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return tutorialService.findById(id);
	}

	@GetMapping("/tutorials/published/{published}")
	public List<Tutorial> findByPublished(@PathVariable boolean published) {
		// TODO Auto-generated method stub
		return tutorialService.findByPublished(published);
	}

	@GetMapping("/tutorials/title/{title}")
	public List<Tutorial> findByTitleContaining(@PathVariable String title) {
		// TODO Auto-generated method stub
		return tutorialService.findByTitleContaining(title);
	}

	@PostMapping("/tutorials")
	public void addTutorial(@RequestBody Tutorial tutorial) {
		// TODO Auto-generated method stub
		tutorialService.addTutorial(tutorial);
	}

	@PutMapping("/tutorials/{id}")
	public void updateTutorial(@PathVariable int id, @RequestBody Tutorial tutorial) {
		// TODO Auto-generated method stub
		tutorialService.updateTutorial(id, tutorial);
	}

	@DeleteMapping("/tutorials/{id}")
	public void deleteTutorial(int id) {
		// TODO Auto-generated method stub
		tutorialService.deleteTutorial(id);
	}
}
