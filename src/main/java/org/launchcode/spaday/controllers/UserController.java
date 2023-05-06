package org.launchcode.spaday.controllers;

import org.launchcode.spaday.Data.UserData;
import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("user")
public class UserController {
    //public ArrayList<User> users=new ArrayList<>();
    @GetMapping

    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Users");
        model.addAttribute("users", UserData.getAll());
        return "users/index";
    }
    @GetMapping("add")
    public String displayAddUserForm(Model model){
        model.addAttribute("title", "All Users");


        return "users/add";
    }
    @PostMapping("add")
    public String processCreateEventForm(
                                         @ModelAttribute User user) {
        UserData.add(user);
        //model.addAttribute()
        return "redirect:";
    }
}
