package com.hnu.service;

import com.hnu.domain.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();
    void savePerson();
}
