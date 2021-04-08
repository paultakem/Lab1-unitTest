package com.company;

public class Person {
    String name;
    int age;

    public Person(String name,int age){
        this.name=name;
        if(age<0)
            this.age=0;
        else
            this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age<0)
            this.age=0;
        else
            this.age=age;
    }
    public String reverseName(String name){
        char[] charName = name.toCharArray();
        char[] reversed = new char[name.length()];
        for (int i = 0; i < name.length(); i++){
            reversed[i] = charName[name.length() - 1 - i];
        }

        return new String(reversed);
    }
}
