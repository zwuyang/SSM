package com.hnu.controller;

import com.hnu.domain.Person;
import com.hnu.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/Person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/testSpringMVC")
    public String testSpringMVC(){
        System.out.println("View: testSpringMVC");
        List<Person> people=personService.findAll();
        for (Person person:people)
            System.out.println(person);
        return "SpringMVC";

    }

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Person> people=personService.findAll();
        model.addAttribute("people",people);
        return "list";
    }

}
