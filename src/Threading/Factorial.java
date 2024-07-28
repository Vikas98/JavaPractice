package Threading;

import java.math.BigInteger;

public class Factorial implements Runnable{
    int item;

    public Factorial(int item)
    {
        this.item = item;
    }
    @Override
    public void run() {
         factorial();
    }
    private  void factorial() {
        BigInteger output = BigInteger.ONE;
        for (int i = 2; i <=this.item ; i++) {
            output = output.multiply(BigInteger.valueOf(i));
        }
        System.out.println("factorial of a number "+item +
                " calculated by thread "+ Thread.currentThread().getName());;
    }
}
