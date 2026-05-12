import java.util.concurrent.*;

public class VirtualThreadDemo {

    public static void main(String[] args)
            throws InterruptedException {

        ExecutorService executor =
                Executors.newVirtualThreadPerTaskExecutor(); // avl from java 21+

        for (int i = 1; i <= 10000; i++) {

            int taskId = i;

            executor.submit(() -> {

                System.out.println(
                        Thread.currentThread()
                );

                Thread.sleep(1000);

                return taskId;
            });
        }

        executor.shutdown();
    }
}