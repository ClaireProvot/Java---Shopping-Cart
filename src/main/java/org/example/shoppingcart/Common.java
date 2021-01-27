package org.example.shoppingcart;

import org.example.shoppingcart.models.CategoryRepository;
import org.example.shoppingcart.models.PageRepository;
import org.example.shoppingcart.models.data.Category;
import org.example.shoppingcart.models.data.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;

@ControllerAdvice
public class Common {

    @Autowired
    private PageRepository pageRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @ModelAttribute
    public void sharedData(Model model, HttpSession session, Principal principal) {

        if (principal != null) {
            model.addAttribute("principal", principal.getName());
        }

        List<Page> pages = pageRepository.findAllByOrderBySortingAsc();

        List<Category> categories = categoryRepository.findAllByOrderBySortingAsc();

        model.addAttribute("cpages", pages);
        model.addAttribute("ccategories", categories);

    }
}
