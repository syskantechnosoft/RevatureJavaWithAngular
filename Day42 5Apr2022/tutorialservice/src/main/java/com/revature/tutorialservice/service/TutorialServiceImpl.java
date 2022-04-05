package com.revature.tutorialservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.tutorialservice.model.Tutorial;
import com.revature.tutorialservice.repo.TutorialRepository;

@Service
public class TutorialServiceImpl implements TutorialService{
	
	@Autowired
	TutorialRepository tutorialRepository;

	@Override
	public List<Tutorial> findAll() {
		// TODO Auto-generated method stub
		return tutorialRepository.findAll();
	}

	@Override
	public Tutorial findById(int id) {
		// TODO Auto-generated method stub
		return tutorialRepository.findById(id).get();
	}

	@Override
	public List<Tutorial> findByPublished(boolean published) {
		// TODO Auto-generated method stub
		return tutorialRepository.findByPublished(published);
	}

	@Override
	public List<Tutorial> findByTitleContaining(String title) {
		// TODO Auto-generated method stub
		return tutorialRepository.findByTitleContaining(title);
	}

	@Override
	public void addTutorial(Tutorial tutorial) {
		// TODO Auto-generated method stub
		tutorialRepository.save(tutorial);
	}

	@Override
	public void updateTutorial(int id, Tutorial tutorial) {
		// TODO Auto-generated method stub
		tutorialRepository.save(tutorial);
	}

	@Override
	public void deleteTutorial(int id) {
		// TODO Auto-generated method stub
		tutorialRepository.deleteById(id);
	}

}
