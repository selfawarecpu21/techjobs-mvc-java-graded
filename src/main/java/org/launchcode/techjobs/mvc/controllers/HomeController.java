package org.launchcode.techjobs.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * Created by LaunchCode
 */

// This class has only one handler method, index, which displays the home page for the app. The controller renders the index.html template (in src/main/resources/templates)




@Controller
public class HomeController {

    @GetMapping(value = "")
    public String index(Model model) {

        HashMap<String, String> actionChoices = new HashMap<>();
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

        model.addAttribute("actions", actionChoices);

        return "index";
    }

}
