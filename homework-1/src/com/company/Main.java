package com.company;

public class Main {

    public static void main(String[] args) {

        //checking ex.1
        Calculator calculator = new Calculator();
        calculator.setNum1((double) 3);
        calculator.setNum2((double) 0);
        System.out.println(calculator.add());
        System.out.println(calculator.subtract());
        System.out.println(calculator.multiply());
        System.out.println(calculator.divide());


        //checking ex.2
        Product product = new Product();
        product.setUpvotes(2);
        product.setDownvotes(33);
        System.out.println(product.getVoteCount());

        //checking ex.3
        Person p1 = new Person("Samuel", 24);
        Person p2 = new Person("Joel", 36);
        Person p3 = new Person("Lily", 24);

        p1.compareAge(p2);// ➞ "Joel is older than me."
        p2.compareAge(p1);// ➞ "Samuel is younger than me."
        p1.compareAge(p3);// ➞ "Lily is the same age as me."

        //checking ex.4
        Luke luke = new Luke();
        luke.relationToLuke("Leia");
        Han han = new Han();
        luke.relationToLuke(han);

        //checking ex.5
        CustomMath customMath = new CustomMath();
        System.out.println(customMath.nextPrime(2));

    }
}
