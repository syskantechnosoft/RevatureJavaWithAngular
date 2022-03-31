package com.springboot.thymeleaf.crud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.springboot.thymeleaf.crud.domain.entities.UserInfo;
import com.springboot.thymeleaf.crud.services.UserService;

import java.util.List;

@Controller
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getUsers(Model model) {
        List<UserInfo> users = userService.getUsers();
        model.addAttribute("users", users);
        model.addAttribute("userInfo", new UserInfo());
        return "users";
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public RedirectView createUser(RedirectAttributes redirectAttributes, @ModelAttribute UserInfo userInfo) {
        userService.createUser(userInfo);
        String message = "Created user <b>" + userInfo.getFirstName() + " " + userInfo.getLastName() + "</b> ✨.";
        RedirectView redirectView = new RedirectView("/", true);
        redirectAttributes.addFlashAttribute("userMessage", message);
        return redirectView;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public String getUser(Model model, @PathVariable("id") Integer id) {
        UserInfo userInfo = userService.getUser(id);
        model.addAttribute("userInfo", userInfo);
        return "edit";
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.POST)
    public RedirectView updateUser(RedirectAttributes redirectAttributes, @PathVariable("id") Integer id, @ModelAttribute UserInfo userInfo) {
        userService.updateUser(id, userInfo);
        String message = (userInfo.isActive() ? "Updated " : "Deleted ") + " user <b>" + userInfo.getFirstName() + " " + userInfo.getLastName() + "</b> ✨.";
        RedirectView redirectView = new RedirectView("/", true);
        redirectAttributes.addFlashAttribute("userMessage", message);
        return redirectView;
    }

}
