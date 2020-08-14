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

}
