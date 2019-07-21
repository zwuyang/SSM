package com.hnu.dao;

import com.hnu.domain.Person;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PersonDao {
    @Select("select * from person")
    List<Person> findAll();
    void savePerson();

}
