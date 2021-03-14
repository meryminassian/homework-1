package com.company;
/*5. create a function in class CustomMath that returns the next prime.
If the number is prime, return the number itself.*/

public class CustomMath {
    private int number;

    public CustomMath(){}

    public CustomMath(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPrime(int number){
        int count_divisors = 0;
        if(number == 0 || number == 1){
            return false;
        } else if(number == 2){
            return true;
        } else {
            for (int i = 2; i < number; i++) {
                if(number%i == 0)
                    count_divisors += 1;
            }

            if(count_divisors > 0)
                return false;
        }
        return true;
    }

    public int nextPrime(int number){
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
                if(isPrime(number + i))
                    return number+i;
        }
        return -1; //if no prime number was found after inputted number
    }

}
