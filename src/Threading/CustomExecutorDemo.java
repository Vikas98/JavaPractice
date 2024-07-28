package Threading;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                                       4,5,
                                       60L, TimeUnit.SECONDS,new LinkedBlockingQueue<>());

        Task task = new Task();
        for (int i = 0; i < 200; i++) {
            threadPoolExecutor.submit(task);
        }
        threadPoolExecutor.shutdown();

        threadPoolExecutor.awaitTermination(10,TimeUnit.MINUTES);

        System.out.println("Main thread is done");

    }
}
