package Threading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Task task = new Task();
        for (int i = 0; i < 100; i++) {
            executorService.submit(task);
        }
        executorService.shutdown();// check point that means after this no thread is accepted

        executorService.awaitTermination(10, TimeUnit.MINUTES);
        // used for joining means main thread waits for maximum specific time in await termination
        //after that main continues no matter all thread is done or not

        System.out.println("Main thread is done");
    }
}
