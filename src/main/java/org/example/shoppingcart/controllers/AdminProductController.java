package org.example.shoppingcart.controllers;

import org.example.shoppingcart.models.CategoryRepository;
import org.example.shoppingcart.models.ProductRepository;
import org.example.shoppingcart.models.data.Category;
import org.example.shoppingcart.models.data.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/products")
public class AdminProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public String index(Model model) {
        List<Product> products = productRepository.findAll();

        model.addAttribute("products", products);

        return "admin/products/index";
    }

    @GetMapping("/add")
    public String add(Product product, Model model) {

        List<Category> categories = categoryRepository.findAll();
        model.addAttribute("categories", categories);

        return "admin/products/add";
    }
}
