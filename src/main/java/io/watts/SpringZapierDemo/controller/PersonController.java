package io.watts.SpringZapierDemo.controller;

import io.watts.SpringZapierDemo.model.Person;
import io.watts.SpringZapierDemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by iyasuwatts on 11/8/17.
 */
@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/people", method = RequestMethod.POST)
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        Person createdPerson = personService.createPerson(person);
        return new ResponseEntity<Person>(createdPerson, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/people/{id}", method = RequestMethod.GET)
    public ResponseEntity<Person> findPersonById(@PathVariable("id") int id){
        Person person = personService.finderPersonById(id);
        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }

}
