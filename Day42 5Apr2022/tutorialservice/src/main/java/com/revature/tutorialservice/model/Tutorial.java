package com.revature.tutorialservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tutorial")
@Data
public class Tutorial {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	private String title;
	private String description;
	private boolean published;

}
