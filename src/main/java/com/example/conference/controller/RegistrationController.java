package com.example.conference.controller;

import com.example.conference.model.Registration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.sound.midi.Soundbank;
import java.util.Map;

@Controller
public class RegistrationController {
    @GetMapping("registration")
    //public String getRegistration(Map<String,Object> model) {
    public String getRegistration(@ModelAttribute("registration") Registration registration) {
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@ModelAttribute("registration") Registration registration) {
        System.out.println("Registration: "+registration.getName());
        return "redirect:registration";
    }
}
