package com.example.ch8.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ch8.demo.PersonRepository1;
import com.example.ch8.demo.Person;

@RestController
public class DataController1 {

    @Autowired
    PersonRepository1 personRepository;

    @RequestMapping("/auto")
    public Page<Person> auto(Person person){

        Page<Person> pagePeople = personRepository.findByAuto(person,PageRequest.of( 0, 10));

        return pagePeople;
    }


}
