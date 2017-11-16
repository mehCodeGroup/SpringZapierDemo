package io.watts.SpringZapierDemo.service;

import io.watts.SpringZapierDemo.model.Person;
import io.watts.SpringZapierDemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by iyasuwatts on 11/8/17.
 */
@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Person createPerson(Person p){
        return personRepository.save(p);
    }

    public Person finderPersonById(int id){
        return personRepository.findOne(id);
    }

}
