package org.example.shoppingcart;

import org.example.shoppingcart.models.PageRepository;
import org.example.shoppingcart.models.data.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@ControllerAdvice
public class Common {

    @Autowired
    private PageRepository pageRepository;

    @ModelAttribute
    public void sharedDate(Model model) {

        List<Page> pages = pageRepository.findAllByOrderBySortingAsc();

        model.addAttribute("cpages", pages);
    }

}
