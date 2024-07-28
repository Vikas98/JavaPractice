package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamDemo {
    public static void main(String[] args) {
       // List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> list = Arrays.asList(100000000 ,200000000,300000000,400000000,500000000
                ,600000000,700000000,800000000,900000000,1000000000);
        // find all the even numbers and print the sum of their squares

//       int sum =  list.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer%2==0;
//            }
//        }).map(new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer*integer;
//            }
//        }).reduce(0, new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                return integer+integer2;
//            }
//        });
//        System.out.println("sum is using streams "+ sum);
        long startTime = System.currentTimeMillis();
        long sum2 =  list.stream().filter((i)->i%2==0).map((i)->i*i*i).reduce(0,(i1,i2)->i1+i2);

        System.out.println("sum is using streams "+ sum2);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime-startTime;
        System.out.println(totalTime);
    }
}
