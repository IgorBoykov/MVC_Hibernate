package ua.lviv.ib.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ua.lviv.ib.model.Person;
import ua.lviv.ib.service.PersonService;
import ua.lviv.ib.service.impl.PersonServiceImpl;

import javax.validation.Valid;
import java.util.List;


@Controller
public class MyController {

    @Autowired
    PersonService personService;

    @GetMapping("/")
    public String hello(Model model){
        List<Person> getAllPersons = personService.getPersonList();
        model.addAttribute("allPersons", getAllPersons);
        return "hello";
    }

    @GetMapping("/new")
    public String newPerson(Model model){
        Person person = new Person();
        model.addAttribute("person", person);
        return "new";
    }

    @PostMapping("/save")
    public String showPerson(@Valid @ModelAttribute("person") Person person
            , BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "new" ;
        } else{
            personService.savePerson(person);
            return "redirect:/";
        }

    }
    @GetMapping("/update")
    public String updatePerson(@RequestParam("personId") int id, Model model){
        Person person = personService.getPerson(id);
        model.addAttribute("person", person);
        return "new";
    }

    @GetMapping("/delete")
    public String deletePerson(@RequestParam("personId") int id){
        personService.deletePerson(id);
        return "redirect:/";
    }
}
