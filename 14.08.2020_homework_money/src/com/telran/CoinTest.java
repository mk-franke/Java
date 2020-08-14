package com.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinTest {

    Coin coin = new Coin();
    int[] coins = {10, 5, 1};

    @Test
    public void testMinCoins_zero_zero() {
        assertEquals(0, coin.minCoins(coins, 0));
    }
    
    @Test
    public void testMinCoins_one_one() {
        assertEquals(1, coin.minCoins(coins, 1));
    }
    
    @Test
    public void testMinCoins_five_one() {
        assertEquals(1, coin.minCoins(coins, 5));
    }
    
    @Test
    public void testMinCoins_ten_one() {
        assertEquals(1, coin.minCoins(coins, 10));
    }

    @Test
    public void testMinCoins_six_two() {
        assertEquals(2, coin.minCoins(coins, 6));
    }

    @Test
    public void testMinCoins_eleven_two() {
        assertEquals(2, coin.minCoins(coins, 11));
    }

    @Test
    public void testMinCoins_fifteen_two() {
        assertEquals(2, coin.minCoins(coins, 15));
    }
    
    @Test
    public void testMinCoins_sixteen_three() {
        assertEquals(3, coin.minCoins(coins, 16));
    }
    
    @Test
    public void testMinCoins_fiftySeven_eight() {
        assertEquals(8, coin.minCoins(coins, 57));
    }

}
