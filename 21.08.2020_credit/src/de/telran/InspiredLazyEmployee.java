package de.telran;

import java.util.List;

public class InspiredLazyEmployee extends StandardEmployee {

    private int inspiredShortestTime;
    private int inspiredLongestTime;
    private int inspirationProbability;

    public InspiredLazyEmployee(int shortestDecisionTime, int longestDecisionTime, String name, int creditNumber, List<Result> resultList, int inspiredShortestTime, int inspiredLongestTime, int inspirationProbability) {
        super(shortestDecisionTime, longestDecisionTime, name, creditNumber, resultList);
        this.inspiredShortestTime = inspiredShortestTime;
        this.inspiredLongestTime = inspiredLongestTime;
        this.inspirationProbability = inspirationProbability;
    }

    @Override
    public void run() {
        long startingTime = System.currentTimeMillis();
        int inspiredCreditsLeft = 0;
        for (int i = 0; i < creditNumber; i++) {
            int creditTime;
            if (inspiredCreditsLeft == 0 && rnd.nextInt(100) < inspirationProbability) {
                inspiredCreditsLeft = 3;
            }
            if (inspiredCreditsLeft > 0) {
                creditTime = rnd.nextInt(inspiredLongestTime - inspiredShortestTime) + inspiredShortestTime;
                inspiredCreditsLeft--;
            } else {
                creditTime = rnd.nextInt(longestDecisionTime - shortestDecisionTime) + shortestDecisionTime;
            }
            try {
                Thread.sleep(creditTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endingTime = System.currentTimeMillis();
        synchronized (resultList) {
            resultList.add(new Result(name, (int) (endingTime - startingTime)));
        }
    }

}
