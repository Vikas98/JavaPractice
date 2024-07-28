package Threading;

import java.math.BigInteger;

public class Factorial2 extends Thread{
    int item;
    public Factorial2(int item)
    {
        this.item = item;
    }
    @Override
    public void run()
    {
        factorial();
    }
    private  void factorial() {
        BigInteger output = BigInteger.ONE;
        for (int i = 2; i <=this.item ; i++) {
            output = output.multiply(BigInteger.valueOf(i));
        }
        System.out.println("factorial of a number "+item+" is "+ output+"" +
                " calculated by thread "+ Thread.currentThread().getName());;
    }
}
