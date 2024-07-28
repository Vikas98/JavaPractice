package Threading.ProblemWithMultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RaceConditionMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        RaceCondition raceCondition = new RaceCondition();
        for (int i = 0; i < 2000 ; i++) {
            executorService.submit(raceCondition);
        }
        executorService.shutdown();

        executorService.awaitTermination(10, TimeUnit.MINUTES);

        System.out.println("Total people in party "+raceCondition.getCount());// we have problem of race
        // condition we have different ways to solve it
    }
}
