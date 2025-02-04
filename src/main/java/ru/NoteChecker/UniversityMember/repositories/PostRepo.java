package ru.NoteChecker.UniversityMember.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.NoteChecker.UniversityMember.data.Post;

public interface PostRepo extends JpaRepository<Post, Long> {
}
