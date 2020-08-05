package com.telran;

public class Square {

    public int sqr(int num) {
        if (num == 1) {
            return 1;
        } else {
            return sqr(num-1) + num + num - 1;
        }
    }

    public int findSquareRecursive(int num, int power) {
        if (power == 0) {
            return 1;
        } else {
            return num * findSquareRecursive(num, power-1);
        }
    }

    public int findSquareLoop(int num, int power) {
        int sqr = 1;
        for (int i = 0; i < power; i++) {
            sqr *= num;
        }
        return sqr;
    }

}
