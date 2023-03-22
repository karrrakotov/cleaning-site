package com.happy.cleaning.controllers;

import com.happy.cleaning.models.Post;
import com.happy.cleaning.models.Responses;
import com.happy.cleaning.repo.PostRepository;
import com.happy.cleaning.repo.ResponsesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class BlogControllerForAdmin {
    @Autowired
    private PostRepository postRepository;

    @Autowired
    private ResponsesRepository responsesRepository;

    @GetMapping("/services-admin")
    public String servicesAdmin(Model model) {
        model.addAttribute("title", "Контакты");

        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);

        return "services-admin";
    }

    @GetMapping("/responses-people")
    public String responsesPeople(Model model) {
        model.addAttribute("title", "Контакты");

        Iterable<Responses> responses = responsesRepository.findAll();
        model.addAttribute("responses", responses);

        return "responses-people";
    }

    @PostMapping("/admin/blog-add")
    public String blogPostAdd(@RequestParam String title, @RequestParam String anons, @RequestParam String full_text, @RequestParam String price, Model model) {
        Post post = new Post(title, anons, full_text, price);
        postRepository.save(post);
        return "redirect:/services-admin";
    }

    @GetMapping("/service/{id}")
    public String serviceDetails(@PathVariable(value = "id") long id, Model model) {
        if(!postRepository.existsById(id)) {
            return "redirect:/services-admin";
        }
        model.addAttribute("title", "Контакты");

        Optional<Post> post = postRepository.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        post.ifPresent(res::add);
        model.addAttribute("post", res);

        return "service-details-admin";
    }

    @GetMapping("/service/{id}/edit")
    public String serviceEdit(@PathVariable(value = "id") long id, Model model) {
        if(!postRepository.existsById(id)) {
            return "redirect:/services-admin";
        }
        model.addAttribute("title", "Контакты");

        Optional<Post> post = postRepository.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        post.ifPresent(res::add);
        model.addAttribute("post", res);

        return "service-details-admin-edit";
    }

    @PostMapping("/service/{id}/edit")
    public String blogPostUpdate(@PathVariable(value = "id") long id, @RequestParam String title, @RequestParam String anons, @RequestParam String full_text, @RequestParam String price, Model model) {
        Post post = postRepository.findById(id).orElseThrow();
        post.setTitle(title);
        post.setAnons(anons);
        post.setFull_text(full_text);
        post.setPrice(price);
        postRepository.save(post);
        return "redirect:/services-admin";
    }

    @PostMapping("/service/{id}/remove")
    public String blogPostDelete(@PathVariable(value = "id") long id, Model model) {
        Post post = postRepository.findById(id).orElseThrow();
        postRepository.delete(post);
        return "redirect:/services-admin";
    }

    @PostMapping("/responses-people/{id}/remove")
    public String responsesDelete(@PathVariable(value = "id") long id, Model model) {
        Responses responses = responsesRepository.findById(id).orElseThrow();
        responsesRepository.delete(responses);
        return "redirect:/responses-people";
    }


}
