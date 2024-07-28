package Threading;

import java.util.concurrent.ThreadFactory;

public class ThreadFactoryDemo implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r);
    }

    public static void main(String[] args) {
        ThreadFactoryDemo demo = new ThreadFactoryDemo();
        Task task = new Task();
        Thread thread = demo.newThread(task);
        thread.start();

        Task2 task1 = new Task2();
        Thread thread1 = demo.newThread(task1);
        thread1.start();
    }
}
// not recommended to use because we have to write lots of code and we have to manually creating thread instead of this
// we use executerservice
