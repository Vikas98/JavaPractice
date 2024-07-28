package Threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        CallableDemo callableDemo = new CallableDemo();

        List<Future<String>> list = new ArrayList<>();
        Future<String> stringFuture = null;

        for (int i = 0; i < 10; i++) {
            list.add(service.submit(callableDemo));
        }
        list.stream().forEach(item-> {
            try {
                System.out.println(item.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });

        //System.out.println(stringFuture.get());

        service.shutdown();
    }
}
