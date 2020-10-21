package br.com.unipac.mvcexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfessorController {

    @GetMapping("/Bom dia")
    public String professor(Model model){
        model.addAttribute("sala", "Esse é feito para o professor!");
        return "professor";
    }
}
aa
