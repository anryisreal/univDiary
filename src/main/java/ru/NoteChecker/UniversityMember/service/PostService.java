package ru.NoteChecker.UniversityMember.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.NoteChecker.UniversityMember.data.Post;
import ru.NoteChecker.UniversityMember.repositories.PostRepo;

@Service
public class PostService {

    @Autowired
    private PostRepo postRepo;

    public Post savePost(Post post) {
        String uniqueLink = "post-" + System.currentTimeMillis();
        post.setLink(uniqueLink);
        return postRepo.save(post);
    }

    public Post getPostById(Long id) {
        return postRepo.findById(id).orElseThrow(() -> new RuntimeException("Пост не найден"));
    }
}