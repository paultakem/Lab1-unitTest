package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonTest {

    private Person personHelper;
    String name = "Paul";
    int age = 30;

    @BeforeEach
    void testConstructor(){
        personHelper = new Person(name, age);
    }

    @Test
    void getAge() {
        int expectedAge = 30;
        assertEquals(expectedAge, personHelper.getAge());
    }

    @Test
    void getName() {
        String expectedName = "Paul";
        assertEquals(expectedName, personHelper.getName());
    }

    @Test
    void setName() {
        assertThrows(IllegalArgumentException.class, () -> personHelper.setName(234));
    }

    @Test
    void setAge() {
        assertThrows(IllegalArgumentException.class, () -> personHelper.setAge("strfgsdgf"));
    }

    @Test
    void reverseName() {
        String expectedReverse = "luaP";
        assertEquals(expectedReverse, personHelper.reverseName(name));
    }
}