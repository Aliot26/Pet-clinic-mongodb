package volha.spring.newpetclinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import volha.spring.newpetclinic.model.Vet;
import volha.spring.newpetclinic.services.VetService;

import java.util.List;

/*
 *Created by olga on 16.04.2020
 */
@Controller
public class VetController {

    private  final VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
    public String listVets(Model model) {

        model.addAttribute("vets", vetService.findAll());
        List<Vet> vets =  vetService.findAll();
        vets.stream().forEach(System.out::println);
        return "vets/index";
    }

    @GetMapping("/api/vets")
    public @ResponseBody List<Vet> getVetsJson(){
        return vetService.findAll();
    }
}
