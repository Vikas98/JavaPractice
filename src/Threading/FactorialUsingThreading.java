package Threading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactorialUsingThreading {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Arrays.asList(10000,20000,30000,40000,50000,60000,70000,80000,90000,100000);
        long startTime = System.currentTimeMillis();
        List<Thread> threadList = new ArrayList<>();
        list.stream().forEach(item->{
            Factorial runnable = new Factorial(item);
            Thread thread = new Thread(runnable);
            thread.start();
            threadList.add(thread);
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);//joining to main thread here make it like a single threaded program
//            }
        });

//        list.stream().forEach(item->
//        {
//            Thread thread = new Factorial2(item);
//            thread.start();
//        });

        threadList.stream().forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        long endTime = System.currentTimeMillis();

        System.out.println("total time taken using multiThreading "+(endTime-startTime));
    }
}
