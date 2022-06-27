package org.wecancoeit.reviews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticController {
    @RequestMapping("/ourteam")
    public String showTeamPage() {
        return "ourteam";
    }
    @RequestMapping("/suggestions")
    public String showSuggestionBoxForm() {
        return "suggestions";
    }
}
