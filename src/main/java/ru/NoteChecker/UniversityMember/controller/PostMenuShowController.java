package ru.NoteChecker.UniversityMember.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostMenuShowController {

    @GetMapping("/")
    public String showPostMenu() {
        return "site/index";
    }
}
