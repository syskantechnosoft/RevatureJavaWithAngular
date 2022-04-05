package com.revature.tutorialservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.tutorialservice.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Integer> {

	List<Tutorial> findByPublished(boolean published);

	List<Tutorial> findByTitleContaining(String title);

}
