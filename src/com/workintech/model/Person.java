package com.workintech.model;

public class Person {
    String firstname;
    String lastname;
    int age;
    String email;
    double height;
    String[] hobbies;

    public Person(String firstname, String lastname, int age){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
    }

    public Person(String firstname, String lastname, int age, String email, double height,String[] hobbies){
        this(firstname,lastname,age);
        this.email=email;
        this.height=height;
        this.hobbies=hobbies;
    }

    public String getFirstName(){
        return firstname;
    }

    public String getLastName(){
        return lastname;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        return age>12 && age<20;
    }
}
