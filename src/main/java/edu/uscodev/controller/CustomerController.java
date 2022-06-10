
package edu.uscodev.controller;

import edu.uscodev.service.CustomerService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class CustomerController {
    
    @Autowired
    CustomerService customerservice;
    
    @GetMapping("/customer1")
    public String list(Model model){
        var customers = customerservice.findAllCustomer();
        model.addAttribute("customers", customers);
        return "customer";
        
    }
    
}
