package ru.NoteChecker.UniversityMember.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import ru.NoteChecker.UniversityMember.data.Post;
import ru.NoteChecker.UniversityMember.service.PostService;

@Controller
public class PostSaveController {

    @Autowired
    private PostService postService;

    @PostMapping("/api/posts/save")
    public RedirectView savePost(@RequestParam("content") String content) {
        Post post = new Post();
        post.setContent(content);

        Post savedPost = postService.savePost(post);

        return new RedirectView("/" + savedPost.getId());
    }

    @GetMapping("/{id}")
    public String showPostPage(@PathVariable Long id, Model model) {
        Post post = postService.getPostById(id);
        model.addAttribute("post", post);
        return "site/staticPost/page";
    }
}
