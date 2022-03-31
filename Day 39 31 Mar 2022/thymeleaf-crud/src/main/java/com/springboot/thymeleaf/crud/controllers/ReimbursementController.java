package com.springboot.thymeleaf.crud.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.springboot.thymeleaf.crud.domain.entities.ReimbStatus;
import com.springboot.thymeleaf.crud.domain.entities.Reimbursement;
import com.springboot.thymeleaf.crud.services.ReimbursementService;

@Controller
@RequestMapping("/reimbursement")
public class ReimbursementController {

	private final ReimbursementService reimbursementService;

	public ReimbursementController(ReimbursementService reimbursementService) {
		this.reimbursementService = reimbursementService;
	}

	@RequestMapping(path = "/request", method = RequestMethod.GET)
	public String getReimbursements(Model model) {
		List<Reimbursement> reimbursements = reimbursementService.getReimbursements();
		model.addAttribute("reimbursements", reimbursements);
		model.addAttribute("reimbursement", new Reimbursement());
		return "reimbursements";
	}

	@RequestMapping(path = "/request", method = RequestMethod.POST)
	public RedirectView createReimbursement(RedirectAttributes redirectAttributes,
			@ModelAttribute Reimbursement reimbursement) {
		reimbursementService.createReimbursement(reimbursement);
		String message = "Submitted reimbursement request for <b>" + reimbursement.getAmount() + "  by  "
				+ reimbursement.getAuthour() + "</b> ✨.";
		RedirectView redirectView = new RedirectView("/reimbursement/request", true);
		redirectAttributes.addFlashAttribute("reimbursementMessage", message);
		return redirectView;
	}

	@RequestMapping(path = "/request/{id}", method = RequestMethod.GET)
	public String getReimbursement(Model model, @PathVariable("id") Integer id) {
		Reimbursement reimbursement = reimbursementService.getReimbursement(id);
		model.addAttribute("reimbursement", reimbursement);
		return "editReimbursement";
	}

	@RequestMapping(path = "/request/{id}", method = RequestMethod.POST)
	public RedirectView updateReimbursement(RedirectAttributes redirectAttributes, @PathVariable("id") Integer id,
			@ModelAttribute Reimbursement reimbursement) {
		reimbursementService.updateReimbursement(id, reimbursement);
		String message = (reimbursement.getStatus() == ReimbStatus.APPROVED ? "Approved " : "Denied ")
				+ " reimbursement Amount <b>" + reimbursement.getAmount() + " requested by "
				+ reimbursement.getAuthour() + "</b> ✨.";
		RedirectView redirectView = new RedirectView("/reimbursement/request", true);
		redirectAttributes.addFlashAttribute("reimbursementMessage", message);
		return redirectView;
	}
}
