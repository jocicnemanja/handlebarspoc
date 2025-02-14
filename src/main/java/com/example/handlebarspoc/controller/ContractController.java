package com.example.handlebarspoc.controller;

import com.example.handlebarspoc.mock.MockContractData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContractController {

    @GetMapping("/contract")
    public String showContract(Model model) {
        model.addAttribute("contractParams", MockContractData.PARAMS);
        return "contract";
    }

    @GetMapping("/h/contract")
    public String showContractHandlebars(Model model) {
        model.addAttribute("contractParams", MockContractData.PARAMS);
        return "hcontract";
    }
}
