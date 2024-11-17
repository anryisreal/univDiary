package ru.NoteChecker.UniversityMember.service;


import ru.NoteChecker.UniversityMember.data.User;

import java.util.List;

public interface AccountService {

    List<User> executeAllAccounts();
    User saveAccount(User account);
    User findByLogin(String login);
    User updateAccount(User account);
    void deleteAccount(String email);

}
