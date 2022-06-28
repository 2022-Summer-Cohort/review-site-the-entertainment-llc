package org.wecancoeit.reviews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancoeit.reviews.model.Destination;
import org.wecancoeit.reviews.model.Hashtag;
import org.wecancoeit.reviews.repos.CategoryRepository;
import org.wecancoeit.reviews.repos.DestinationRepository;
import org.wecancoeit.reviews.repos.HashtagRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
@RequestMapping("/destination")

public class DestinationController {
    private DestinationRepository destinationRepo;
    private HashtagRepository hashtagRepo;

    public DestinationController(DestinationRepository destinationRepo, HashtagRepository hashtagRepo) {
        this.destinationRepo = destinationRepo;
        this.hashtagRepo = hashtagRepo;
    }

    @RequestMapping("/{id}")
    public String showDestination(Model model, @PathVariable Long id){
        model.addAttribute("destination", destinationRepo.findById(id).get());
        return "destination";
    }
    @PostMapping("/{id}/addhashtag")
    public String addHashTag(@PathVariable Long id, @RequestParam String hashtag){
        Destination destination = destinationRepo.findById(id).get();
        Optional<Hashtag> hashtagOptional = hashtagRepo.findByhashtagDescriptionIgnoreCase(hashtag);
        if(hashtagOptional.isPresent()){
            if(!destination.getHashtags().contains(hashtagOptional.get())){
                destination.addHashtag(hashtagOptional.get());
            }
        }
        else{
            Hashtag hashtag1 = new Hashtag(hashtag);
            hashtagRepo.save(hashtag1);
            destination.addHashtag(hashtag1);

        }
        destinationRepo.save(destination);
        return "redirect:/destination/"+id;



    }






}
