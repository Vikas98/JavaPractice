package Threading;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "hello this is printed by "+Thread.currentThread().getName();
    }


}
