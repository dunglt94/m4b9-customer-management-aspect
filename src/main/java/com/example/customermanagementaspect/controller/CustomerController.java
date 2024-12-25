package com.example.customermanagementaspect.controller;

import com.example.customermanagementaspect.model.Customer;
import com.example.customermanagementaspect.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping
    public String showList(Model model) {
        try {
            List<Customer> customers = customerService.findAll();
            model.addAttribute("customers",customers );
            return "list";
        } catch (Exception e) {
            return "redirect:/customers/create";
        }
    }

    @GetMapping("/{id}/view")
    public String showView(@PathVariable Long id, Model model) {
        try {
            Customer customer = customerService.findById(id);
            model.addAttribute("customer",customer);
            return "view";
        } catch (Exception e) {
            return "redirect:/customers";
        }
    }

    @GetMapping("/update")
    public String update(Customer customer) {
        try {
            customerService.save(customer);
            return "create";
        } catch (Exception e) {
            return "redirect:/customers";
        }
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        try {
            customerService.delete(id);
            return "view";
        } catch (Exception e) {
            return "redirect:/customers";
        }
    }

}
