package org.wecancoeit.reviews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.repos.DestinationRepository;
import org.wecancoeit.reviews.repos.HashtagRepository;

@Controller
@RequestMapping("/hashtags")
public class HashtagController {
    private HashtagRepository hashtagRepo;
    private DestinationRepository destinationRepo;

    public HashtagController(HashtagRepository hashtagRepo, DestinationRepository destinationRepo) {
        this.hashtagRepo = hashtagRepo;
        this.destinationRepo = destinationRepo;
    }

    @RequestMapping("")
    public String showAllHashtag(Model model) {
        model.addAttribute("hashtag", hashtagRepo.findAll());
        return "hashtag";
    }

    @RequestMapping("/{id}")
    public String showHashTagDestinations(Model model, @PathVariable Long id) {
        model.addAttribute("hashtagdestination", hashtagRepo.findById(id).get());
        return "hashtagdestination";
    }

}

