package com.hzdawoud.springpetclinic.controller;

import com.hzdawoud.springpetclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vet","/vets/index","/vets/index/html", "vets.html"})
    public String listVets(Model model) {
        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }

    @RequestMapping("/oups")
    public String oops() {
        return "oops";
    }
}
