package by.maksim.controller;

import by.maksim.domain.Post;
import by.maksim.repository.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping("/blog/add")
@PreAuthorize(value = "hasAuthority('ADMIN')")
@Slf4j
public class AdminController {

    @Autowired
    private PostRepository postRepository;

    @PostMapping
    public String blogAddPost(@Valid @RequestParam String title, @Valid @RequestParam String anons,
                              @Valid @RequestParam String full_text, Model model) {
        Post post = new Post(title, anons, full_text);
        postRepository.save(post);
        log.info("Post was successfully added.");
        return "redirect:/blog";
    }
}
