package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@Controller
public class SpaDayController {

    @GetMapping(value="")
    //@ResponseBody
    public String customerForm () {

        return "serviceSelection";
    }

    @PostMapping(value="")
    public String spaMenu(@RequestParam String name, @RequestParam String skintype,
                          @RequestParam String manipedi, Model model) {

        Client client=new Client(skintype,manipedi,name);
        client.setAppropriateFacials(skintype);

//        model.addAttribute("name",name);
//        model.addAttribute("skintype",skintype);
//        model.addAttribute("manipedi",manipedi);
//        model.addAttribute("appropriateFacials",client.getAppropriateFacials());
        model.addAttribute("client" ,client);
        return "menu";
    }
}
