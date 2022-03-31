package com.springboot.thymeleaf.crud.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.thymeleaf.crud.domain.entities.Reimbursement;
import com.springboot.thymeleaf.crud.domain.repositories.ReimbursementRepository;
import com.springboot.thymeleaf.crud.exceptions.NotFoundException;

@Service
public class ReimbursementService {

	private final ReimbursementRepository reimbursementRepository;

	public ReimbursementService(ReimbursementRepository reimbursementRepository) {
		this.reimbursementRepository = reimbursementRepository;
	}

	public Reimbursement getReimbursement(Integer id) {
		return reimbursementRepository.findById(id).orElseThrow(NotFoundException::new);
	}

	public Reimbursement createReimbursement(Reimbursement reimbursement) {
		return reimbursementRepository.save(reimbursement);
	}

	public List<Reimbursement> getReimbursements() {
		return reimbursementRepository.findAll();
	}

	public Reimbursement updateReimbursement(Integer id, Reimbursement request) {
		Reimbursement fromDb = getReimbursement(id);
		fromDb.setDescription(request.getDescription());
		fromDb.setAmount(request.getAmount());
		fromDb.setAuthour(request.getAuthour());
		fromDb.setResolver(request.getResolver());
		fromDb.setResolved(LocalDateTime.now());
		fromDb.setSubmitted(request.getSubmitted());
		fromDb.setStatus(request.getStatus());
		fromDb.setType(request.getType());
		return reimbursementRepository.save(fromDb);
	}

}
