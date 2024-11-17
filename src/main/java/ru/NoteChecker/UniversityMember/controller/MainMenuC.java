package ru.NoteChecker.UniversityMember.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class MainMenuC {

    @GetMapping("/")
    public String menu() {
        return "main";
    }
}
