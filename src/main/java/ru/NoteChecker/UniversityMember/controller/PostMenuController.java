package ru.NoteChecker.UniversityMember.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.NoteChecker.UniversityMember.data.Post;
import ru.NoteChecker.UniversityMember.repositories.PostRepo;
import ru.NoteChecker.UniversityMember.service.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostMenuController {

    @Autowired
    private PostService postService;

    @PostMapping("/save")
    public String savePost(@RequestParam("content") String content) {
        Post post = new Post();
        post.setContent(content);

        Post savedPost = postService.savePost(post);

        return "redirect:/api/posts/" + savedPost.getId();
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable Long id) {
        return postService.getPostById(id);
    }
}
