package com.company;

/**
 * Created by vishalms on 29/11/17.
 */

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(100);

    }
    public static void fizzBuzz(int n) {
        for (int number = 1;number <= n; number++) {
            boolean factThree = number % 3 == 0 ? true : false;
            boolean factFive = number % 5 == 0 ? true : false;
            if(!factThree && !factFive) {
                System.out.print(number);
            }
            if(factThree) {
                System.out.print("Fizz");
            }
            if(factFive) {
                System.out.print("Buzz");
            }
            System.out.println();
        }
    }
}
