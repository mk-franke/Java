package com.telran;

import java.util.List;
import java.util.Random;

public class Cockroach extends Thread {

    private static final int FASTEST_STEP_TIME = 50;
    private static final int SLOWEST_STEP_TIME = 100;

    private String name;
    private int steps;
    private List<Score> score;

    Random random = new Random();

    public Cockroach(String name, int steps, List<Score> score) {
        this.name = name;
        this.steps = steps;
        this.score = score;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < steps; i++) {
            int stepLength = FASTEST_STEP_TIME + random.nextInt(SLOWEST_STEP_TIME-FASTEST_STEP_TIME);
            try {
                Thread.sleep(stepLength);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int runDuration = (int) (System.currentTimeMillis() - startTime);
        synchronized (score) {
            score.add(new Score(name, runDuration));
        }
    }

}
