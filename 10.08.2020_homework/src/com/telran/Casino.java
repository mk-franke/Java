package com.telran;

public class Casino {

    public int getNumOfOptimalSteps(int N, int M) {
        if (N == 1)
            return 0;
        if (N%2 == 0 && M>0)
            return 1 + getNumOfOptimalSteps(N/2, M-1);
        return 1 + getNumOfOptimalSteps(N-1, M);
    }

}
