package com.example.springboot_web_app_with_login.web;

import com.example.springboot_web_app_with_login.model.User;
import com.example.springboot_web_app_with_login.service.UserService;
import com.example.springboot_web_app_with_login.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserRegistrationController {

    private UserService userService;

    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    // Hierdurch wird dem Register Formular der User mitgeliefert
    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }

    // Die Get Methode für die Login Seite
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {

        model.addAttribute("login", new User());
        model.addAttribute("register", new UserRegistrationDto());
        return "login";
    }


    // Die POST Methode für das Register Form
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto, Model model) {
        model.addAttribute("register", new UserRegistrationDto());
        userService.save(registrationDto);
        return "redirect:login?success";
    }
}
