package org.example.shoppingcart.controllers;

import org.example.shoppingcart.models.PageRepository;
import org.example.shoppingcart.models.data.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/pages")
public class AdminPagesController {

    @Autowired
    private PageRepository pageRepository;

    @GetMapping
    public String index(Model model) {

        List<Page> pages = pageRepository.findAll();

        model.addAttribute("pages", pages);

        return "admin/pages/index";
    }

    @GetMapping("/add")
    public String add(@ModelAttribute Page page) {

        return "admin/pages/add";
    }
}
