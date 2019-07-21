package com.hnu.test;

import com.hnu.dao.PersonDao;
import com.hnu.domain.Person;
import com.hnu.service.PersonService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestSSM {

    @Test
    public void testSpring(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:ApplicationContent.xml");
        PersonService personService= (PersonService) ac.getBean("PersonService");
        personService.findAll();
    }

    @Test
    public void testMybatis() throws IOException {
       InputStream in= Resources.getResourceAsStream("SqlMappingConfig.xml");

        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);

        SqlSession session=sqlSessionFactory.openSession();
        PersonDao dao=session.getMapper(PersonDao.class);
        List<Person> people=dao.findAll();
        for (Person person:people)
            System.out.println(person);
        session.close();
        in.close();
    }
}
