package com.example.javaproject2.week7.day30_31.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonDAOTest {

    PersonDAO personDAO = new PersonDAO();

    @BeforeEach
    void setUp() {
        personDAO.initPerson();
    }

    @Test
    void findByNamePerson() {
        String name = "leo";
        personDAO.insertPerson(name);
        assertEquals(name, personDAO.findByNamePerson(name).get().getName());
        assertNotEquals(name, personDAO.findByNamePerson("aa"));
        assertEquals(Optional.empty(), personDAO.findByNamePerson("aa"));
    }

    @Test
    void findAllPerson() {
        personDAO.insertPerson("leo");
        personDAO.insertPerson("yui");
        assertEquals("[001 leo, 002 yui]", personDAO.findAllPerson().toString());
    }

    @Test
    void insertPerson() {
        int cnt = personDAO.insertPerson("leo");
        assertEquals(1, cnt);
    }
}