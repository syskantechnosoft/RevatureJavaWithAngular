package com.revature.tutorialservice.service;

import java.util.List;

import com.revature.tutorialservice.model.Tutorial;

public interface TutorialService {

	public List<Tutorial> findAll();

	public Tutorial findById(int id);

	public List<Tutorial> findByPublished(boolean published);

	public List<Tutorial> findByTitleContaining(String title);

	public void addTutorial(Tutorial tutorial);

	public void updateTutorial(int id, Tutorial tutorial);

	public void deleteTutorial(int id);

}
