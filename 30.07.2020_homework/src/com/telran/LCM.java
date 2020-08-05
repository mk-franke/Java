package com.telran;

public class LCM {

    public int findLCM(int a, int b) {
        if (a == 0 ||  b == 0) {
            return 0;
        }
        int m = a*b;
        while (b != 0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return m/a;
    }

    public int countLCM(int a, int b) {
        if (a == 0 ||  b == 0) {
            return 0;
        }
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int lcm = max;
        while (lcm%min != 0) {
            lcm += max;
        }
        return lcm;
    }

}
