package com.springboot.thymeleaf.crud.domain.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "reimbursement")
@Data
public class Reimbursement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String description;
	private double amount;

	private Integer authour;
	private Integer resolver;
	private LocalDateTime submitted = LocalDateTime.now();
	private LocalDateTime resolved;

	private ReimbStatus status;
	private ReimbType type;
}
