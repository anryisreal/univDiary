package ru.NoteChecker.UniversityMember.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestContr {

    @GetMapping("/test")
    public String page() {
        return "site/staticPost/page";
    }
}
