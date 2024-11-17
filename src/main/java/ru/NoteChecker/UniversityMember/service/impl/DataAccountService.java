package ru.NoteChecker.UniversityMember.service.impl;

import org.springframework.stereotype.Service;
import ru.NoteChecker.UniversityMember.data.User;
import ru.NoteChecker.UniversityMember.service.AccountService;

import java.util.List;

@Service
public class DataAccountService implements AccountService {


    @Override
    public List<User> executeAllAccounts() {
        return null;
    }

    @Override
    public User saveAccount(User account) {
        return null;
    }

    @Override
    public User findByLogin(String login) {
        return null;
    }

    @Override
    public User updateAccount(User account) {
        return null;
    }

    @Override
    public void deleteAccount(String email) {

    }
}
