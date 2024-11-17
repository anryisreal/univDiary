package ru.NoteChecker.UniversityMember.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.NoteChecker.UniversityMember.data.User;
import ru.NoteChecker.UniversityMember.service.AccountService;

@Controller
@AllArgsConstructor
public class AccountController {
    @Autowired
    private AccountService service;


    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String check(Model model) {

        return "main";
    }

    @PostMapping("/main")
    public String login (@RequestParam User account, Model model) {
        return "main";
    }
}
