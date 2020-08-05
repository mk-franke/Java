package com.telran;

public class GCD {

    /**
     * The function evaluates GCD of two numbers
     * @param a must be a positive number
     * @param b must be a positive number
     * @return greatest common divisor
     */

    public int countGCD(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        int d = a%b;
        return countGCD(b, d);
    }

    public int findGCD(int a, int b) {
        while (b != 0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

}
