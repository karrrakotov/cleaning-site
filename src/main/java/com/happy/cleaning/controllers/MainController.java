package com.happy.cleaning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Клининговая компания");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "О нас");
        return "about";
    }

    @GetMapping("/services")
    public String services(Model model) {
        model.addAttribute("title", "Наши услуги");
        return "services";
    }

    @GetMapping("/blog")
    public String blog(Model model) {
        model.addAttribute("title", "Новостной блог");
        return "blog";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Контакты");
        return "contact";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("title", "Admin");
        return "admin";
    }

    @GetMapping("/admin/blog-add")
    public String add(Model model) {
        model.addAttribute("title", "Добавить новую запись");
        return "blog-add";
    }

    @GetMapping("/logins")
    public String logins(Model model) {
        model.addAttribute("title", "Добавить новую запись");
        return "/admin";
    }
}
