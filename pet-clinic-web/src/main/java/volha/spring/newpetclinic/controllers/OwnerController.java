package volha.spring.newpetclinic.controllers;

/*
 *Created by olga on 16.04.2020
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import volha.spring.newpetclinic.model.Owner;
import volha.spring.newpetclinic.services.OwnerService;

import java.util.List;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }

    @RequestMapping({"/find"})
    public String findOwners(Model model) {
        model.addAttribute("owner", Owner.builder().build());
        return "owners/findOwners";
    }

    @RequestMapping
    public String processFindForm(Owner owner, BindingResult result, Model model) {
        if (owner.getLastName() == null) {
            owner.setLastName("");
        }
        List<Owner> results = ownerService.findAllByLastNameLike(owner.getLastName());
        if (results.isEmpty()) {
            result.rejectValue("LastName", "NotFound", "not found");
            return "owners/findOwners";
        } else if (results.size() == 1) {
            owner = results.get(0);
            return "redirect:/owners/" + owner.getId();
        } else {
            model.addAttribute("selections", results);
            return "owners/ownersList";
        }
    }

    @RequestMapping("/{ownerId}")
    public ModelAndView showOwner(@PathVariable Long ownerId) {
        ModelAndView mav = new ModelAndView("owners/ownerDetails");
        mav.addObject(ownerService.findById(ownerId));
        return mav;
    }

}
