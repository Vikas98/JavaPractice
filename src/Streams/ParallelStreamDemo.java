package Streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100000000 ,200000000,300000000,400000000,500000000
                ,600000000,700000000,800000000,900000000,1000000000);
        long startTime = System.currentTimeMillis();
        int sum = list.parallelStream().filter(i->i%2==0).map(i->i*i*i).reduce(0,(i1,i2)->i1+i2);
        System.out.println("sum using parallel streaming "+sum);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime-startTime;
        System.out.println(totalTime);
    }
}
