package Threading;

public class Client {
    public static void main(String[] args) {
//        System.out.println(Runtime.getRuntime().availableProcessors());
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
//        thread.start();
        Thread thread1 = new Task2();
        thread1.start();
    }
}
