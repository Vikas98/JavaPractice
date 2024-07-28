package Threading;

import java.util.Arrays;
import java.util.List;

public class CalculateSquareOfList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,80,90,100);

        list.stream().forEach(integer ->
        {
            SquareOfNumber squareOfNumber = new SquareOfNumber(integer);
            Thread thread = new Thread(squareOfNumber);
            thread.start();
        });
    }
}
