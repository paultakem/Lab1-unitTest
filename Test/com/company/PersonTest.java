package com.company;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person personHelper = new Person("Tom", 25);
    String name;
    int age;

    @Test
    int getAge() {
        return age;
    }

    @Test
    String getName() {
        return name;
    }

    @Test
    void setName() {
        this.name = name;
    }

    @Test
    void setAge() {
        int age = -1;

        if(age<0)
            this.age=0;
        else
            this.age=age;
    }

    @Test
    String reverseName() {

        String name = "George";

        char[] charName = name.toCharArray();
        char[] reversed = new char[name.length()];
        for (int i = 0; i < name.length(); i++){
            reversed[i] = charName[name.length() - 1 - i];
        }

        return new String(reversed);
    }
    // We have introduced a temporary storage for name in terms of chars, because we will operate over single characters
    // and it is convenient to do it in characters. Then simply put chars from end of charName last to the start of reversed array one by one
}