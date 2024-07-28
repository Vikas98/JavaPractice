package Threading;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class FactorialWithoutThreading {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10000,20000,30000,40000,50000,60000,70000,80000,90000,100000);
        // NQ > 10000 we can apply multi threading here
        long startTime = System.currentTimeMillis();

        list.stream().map(item->factorial(item)).forEach(item -> System.out.println(item));

        long endTime = System.currentTimeMillis();

        System.out.println("time taken without multi threading "+(endTime-startTime));
    }

    private static BigInteger factorial(int item) {
       BigInteger output = BigInteger.ONE;
        for (int i = 2; i <=item ; i++) {
            output = output.multiply(BigInteger.valueOf(i));
        }
        return output;
    }
}
