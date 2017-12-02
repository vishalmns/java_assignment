package com.company;

import java.util.ArrayList;

/**
 * Created by vishalms on 29/11/17.
 */
public class PrimeFactor {
    static ArrayList<Integer> pf = new ArrayList<>();

    public static void main(String[] args) {
        primeFactor(30);
        System.out.println(pf);
    }

    public static void primeFactor(int n) {
        while (n % 2 == 0) {
            pf.add(2);
            n = n / 2;
        }
        for (int fact = 3; fact <= (int) Math.sqrt(n); fact++) {
            if (n % fact == 0) {
                pf.add(fact);
                n = n / fact;
            }
        }
        // special case when n is a prime number
        if (n > 2) {
            pf.add(n);
        }
    }
}
