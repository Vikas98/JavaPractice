package Threading;

public class SquareOfNumber implements Runnable{
    int item ;

    public SquareOfNumber(int item)
    {
        this.item = item;
    }
    @Override
    public void run()
    {
        square();
    }
    public void square()
    {
        System.out.println("square of a number "+this.item+" is "+this.item*this.item+"" +
                " calculated by the thread "+Thread.currentThread().getName());
    }

}
