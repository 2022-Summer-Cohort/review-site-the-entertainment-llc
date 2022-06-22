package org.wecancoeit.reviews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.model.Destination;
import org.wecancoeit.reviews.model.Hashtag;
import org.wecancoeit.reviews.repos.CategoryRepository;
import org.wecancoeit.reviews.repos.DestinationRepository;

@Controller
@RequestMapping("/destination")

public class DestinationController {
    private DestinationRepository destinationRepo;

    public DestinationController(DestinationRepository destinationRepo) {
        this.destinationRepo = destinationRepo;
    }

    @RequestMapping("/{id}")
    public String showDestination(Model model, @PathVariable Long id){
        model.addAttribute("destination", destinationRepo.findById(id).get());
        return "destination";
    }
    @RequestMapping("/{id}/addhashtag")
    public String addHashTag(@PathVariable Long id){
        Hashtag firstHashTag = new Hashtag("#New");
        Destination destination = destinationRepo.findById(id).get();
        destination.addHashtag(firstHashTag);
        destinationRepo.save(destination);
        return "redirect:/destination/"+id;



    }






}
