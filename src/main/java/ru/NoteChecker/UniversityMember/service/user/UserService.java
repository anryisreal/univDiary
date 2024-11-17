package ru.NoteChecker.UniversityMember.service.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ru.NoteChecker.UniversityMember.config.ConvertUserDetails;
import ru.NoteChecker.UniversityMember.data.User;
import ru.NoteChecker.UniversityMember.repositories.UserRepo;

import java.util.Optional;

@Component
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user =  userRepo.findByUsername(username);
        return user.map(ConvertUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("user not found" + username));
    }
}
