package Threading.ProblemWithMultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class RaceCondition implements Runnable {
    //private int count;

    private AtomicInteger count = new AtomicInteger();

    public RaceCondition()
    {
        count.getAndSet(0);
    }
    public int getCount() {
        return count.get();
    }
    @Override
    public void run() {
        increaseCount();
    }
//    public synchronized void increaseCount()
//    {
//        count++;
//    }
    public  void increaseCount()
    {
       count.getAndAdd(1);
    }
}
/*we have different ways to solve race condition problem
* 1. using synchronization (but the programs works as single threaded because only 1 thread can executed the
* block of code
* 2. using atomic integer class which are specifically design for multithreading
* */