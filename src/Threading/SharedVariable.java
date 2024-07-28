package Threading;

public class SharedVariable implements Runnable {
    static int variable;

    @Override
    public void run() {
        System.out.println("previous value of variable is "+ variable+" " +
                "value of variable after increased is "+(++variable)+" " +
                "increased by thread "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            SharedVariable sharedVariable = new SharedVariable();
            Thread thread = new Thread(sharedVariable);

            thread.start();
        }
    }
}
