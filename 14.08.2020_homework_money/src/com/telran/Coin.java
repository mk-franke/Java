package com.telran;

public class Coin {

    public int minCoins(int[] coins, int sum) {
        if (sum == 0)
            return 0;
        int res = 0;
        int remainder = sum;
        for (int i = 0; i < coins.length; i++) {
            while (remainder - coins[i] >= 0) {
                remainder -= coins[i];
                res++;
            }
        }
        return res;
    }

    public int exchange(int sum) {
        int res = sum/10;
        sum %= 10;
        res += sum/5;
        sum %= 5;
        res += sum;
        return res;
    }

}
