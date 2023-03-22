package com.happy.cleaning.controllers;

import com.happy.cleaning.models.Post;
import com.happy.cleaning.models.Responses;
import com.happy.cleaning.repo.PostRepository;
import com.happy.cleaning.repo.ResponsesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class BlogControllerForClient {
    @Autowired
    private PostRepository postRepository;

    @Autowired
    private ResponsesRepository responsesRepository;

    @GetMapping("/services-client")
    public String servicesClient(Model model) {
        model.addAttribute("title", "Контакты");

        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);

        return "services-client";
    }

    @GetMapping("/services-client/service/{id}")
    public String serviceDetails(@PathVariable(value = "id") long id, Model model) {
        if(!postRepository.existsById(id)) {
            return "redirect:/services-client";
        }
        model.addAttribute("title", "Контакты");

        Optional<Post> post = postRepository.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        post.ifPresent(res::add);
        model.addAttribute("post", res);

        return "service-details-client";
    }

    @PostMapping("/services-client/service/{id}")
    @PreAuthorize("permitAll()")
    @PostAuthorize("permitAll()")
    @Secured("permitAll()")
    public String ordersAdd(@RequestParam String name, @RequestParam String surname, @RequestParam String zaptel, @RequestParam String address, @RequestParam String getTitle, @RequestParam String getPrice, Model model) {
        Responses responses = new Responses(name, surname, zaptel, address, getTitle, getPrice);
        responsesRepository.save(responses);
        return "redirect:/services-client";
    }
}
