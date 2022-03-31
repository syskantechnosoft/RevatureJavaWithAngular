package com.springboot.thymeleaf.crud.domain.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.thymeleaf.crud.domain.entities.ReimbStatus;
import com.springboot.thymeleaf.crud.domain.entities.Reimbursement;

public interface ReimbursementRepository extends JpaRepository<Reimbursement, Integer> {

	public List<Reimbursement> findAllByStatus(ReimbStatus status);
	
	public List<Reimbursement> findAllByAuthour (Integer id);
}
