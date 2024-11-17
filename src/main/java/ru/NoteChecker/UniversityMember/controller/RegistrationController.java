package ru.NoteChecker.UniversityMember.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.NoteChecker.UniversityMember.data.User;
import ru.NoteChecker.UniversityMember.repositories.UserRepo;

import java.util.*;

@Controller
@AllArgsConstructor
public class RegistrationController {
    @Autowired
    private UserRepo accountRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/reg")
    public String registration() {
        return "reg";
    }

    @PostMapping("/reg")
    public String addNewAccount (User user, Map<String, Object> model) {
/*        Optional<User> fromDataBase = accountRepo.findByUsername(account.getUsername());
        if (fromDataBase != null) {
            model.put("message", "User already exists");
            return "reg";
        }*/
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles("USER");
        accountRepo.save(user);

        return "redirect:/login ";
    }
}
