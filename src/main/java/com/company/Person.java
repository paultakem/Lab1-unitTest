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

    public void setName(Object name) {
        if(!(name instanceof String))
            throw new IllegalArgumentException("Parameter age must be of type integer");
        this.name = (String) name;
    }

    public void setAge(Object age) {
        if(!(age instanceof Integer))
            throw new IllegalArgumentException("Parameter age must be of type integer");
        int age1 = (Integer)age;
        if(age1 < 0)
            this.age=0;
        else
            this.age=age1;
    }
    public String reverseName(String name){
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
