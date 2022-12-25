package com.fci.advanced.se.personsservices.businessLogic;


import com.fci.advanced.se.personsservices.models.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonsBsl {
    private final List<Person> personTable;

    public PersonsBsl() {
        this.personTable = new ArrayList<>();
    }

    public String add(Person person){
        for (Person personDb: personTable) {
            if(personDb.getId() == person.getId()){
                return "This id already exist";
            }
        }
        personTable.add(person);
        return "Added Successfully";
    }

    public Person getPerson(int id) {
        for (Person personDb: personTable) {
            if(personDb.getId() == id){
                return personDb;
            }
        }
        return null;
    }

    public Person print(){
        for (Person person:personTable) {
            return person;
        }
        return null;
    }
}
