package ru.NoteChecker.UniversityMember.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.NoteChecker.UniversityMember.data.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
