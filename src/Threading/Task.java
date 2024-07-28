package Threading;

public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("vikas name is printed by the thread name "+Thread.currentThread().getName());
    }
}
