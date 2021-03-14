package com.company;
/*4. Luke Skywalker has family and friends. Help him remind them who is who.
        Given a string with a name, return the relation of that person to Luke.*/

public class Luke {

    //given a string with a name
    public void relationToLuke(String name){
        switch (name){
            case "Darth Vader":
                System.out.println("Luke, I am your father.");
                break;
            case "Leia":
                System.out.println("Luke, I am your sister.");
                break;
            case "Han":
                System.out.println("Luke, I am your brother in law.");
                break;
            case "R2D2":
                System.out.println("Luke, I am your droid.");
                break;
            default:
                System.out.println("unknown person");
        }
    }

    //given an object (overloading)
    public void relationToLuke(Object object){
        if(object instanceof Vader)
            System.out.println("Luke, I am your father.");
        else if(object instanceof Leia)
            System.out.println("Luke, I am your sister.");
        else if(object instanceof Han)
            System.out.println("Luke, I am your brother in law.");
        else if(object instanceof R2D2)
            System.out.println("Luke, I am your drone");
        else
            System.out.println("unknown person");
    }

}
