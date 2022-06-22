package org.wecancoeit.reviews.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.repos.CategoryRepository;

@Controller
//@RequestMapping("/category")
public class CategoryController {

    private CategoryRepository categoryRepo;

    public CategoryController(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }
    @RequestMapping("/")
    public String showAllCategories(Model model){
        model.addAttribute("categories", categoryRepo.findAll());
        return "categories";
    }
    @RequestMapping("categories/{id}")
    public String showCategory(Model model, @PathVariable Long id){
        model.addAttribute("category", categoryRepo.findById(id).get());
        return "category";
    }
}
