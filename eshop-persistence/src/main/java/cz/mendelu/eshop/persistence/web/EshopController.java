package cz.mendelu.eshop.persistence.web;

import cz.mendelu.eshop.persistence.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EshopController {

    @Autowired
    private CustomerService cService;

    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("message", "Programmer Gate");
        return "index";
    }
}
