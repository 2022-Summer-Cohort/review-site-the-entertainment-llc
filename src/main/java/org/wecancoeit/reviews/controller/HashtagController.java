package org.wecancoeit.reviews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.repos.DestinationRepository;
import org.wecancoeit.reviews.repos.HashtagRepository;

@Controller
@RequestMapping("/hashtag")
public class HashtagController {
    private HashtagRepository hashtagRepo;
    private DestinationRepository destinationRepo;

    public HashtagController(HashtagRepository hashtagRepo, DestinationRepository destinationRepo ) {
        this.hashtagRepo = hashtagRepo;
        this.destinationRepo = destinationRepo;
    }

    @RequestMapping("/{id}")
    public String showHashTagDestinations (Model model, @PathVariable Long id){
        model.addAttribute("hashtagdestination", destinationRepo.findById(id).get());
        return "hashtagdestination";
    }


        @RequestMapping("")
        public String showHashtag (Model model, @PathVariable Long id){
            model.addAttribute("hashtag", hashtagRepo.findAll());
            return "hashtag";
        }
    }

