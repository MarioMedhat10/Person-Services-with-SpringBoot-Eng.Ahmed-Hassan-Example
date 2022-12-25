package com.fci.advanced.se.personsservices.controllers;


import com.fci.advanced.se.personsservices.businessLogic.PersonsBsl;
import com.fci.advanced.se.personsservices.models.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonsController {
    private PersonsBsl personsBsl;

    public PersonsController(PersonsBsl personsBsl) {
        this.personsBsl = personsBsl;
    }

    @PostMapping(value = "/persons")
    public String addPerson(@RequestBody Person person){
        return personsBsl.add(person);
    }

    @GetMapping(value = "/persons/{id}")
    public Person getPerson(@PathVariable("id") int id){
        return personsBsl.getPerson(id);
    }

    @GetMapping(value = "/persons/getall")
    public Person getall(){
        return personsBsl.print();
    }
}
