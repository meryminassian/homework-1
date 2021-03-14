package com.company;
/* 3. Create a method in the Person class which returns how another person's age compares.
Given the instances p1, p2 and p3, which will be initialised with the attributes name and age,
return a sentence in the following format:
{other person name} is {older than / younger than / the same age as} me.*/
public class Person {
    private String name;
    private int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        if(age > 0 )
            this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0)
            this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void compareAge(Person p2){
        if(p2.getAge() > age){
            System.out.println(p2.getName() + " is older than me");
        }
        else if (p2.getAge() < age){
            System.out.println(p2.getName() + " is younger than me");
        }else
            System.out.println(p2.getName() + " the same age as me");
    }

}