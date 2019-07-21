package com.hnu.service;

import com.hnu.dao.PersonDao;
import com.hnu.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("PersonService")
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> findAll() {
        System.out.println("Service: FindALL");
        return personDao.findAll();
    }

    @Override
    public void savePerson() {
        System.out.println("Service: SavePerson");
    }
}
