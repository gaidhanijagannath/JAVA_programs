package ThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolCallableDemo {

    public static void main(String[] args) {

        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(
                        2,                      // core pool size
                        4,                      // max pool size
                        10,                     // keep alive time
                        TimeUnit.SECONDS,
                        new ArrayBlockingQueue<>(2), // task queue
                        Executors.defaultThreadFactory(), // Executors.defaultThreadFactory(), we can customize this
                        new CustomRejectedExecutionHandler() // new ThreadPoolExecutor.AbortPolicy() what to do with rejection
                );

        executor.allowCoreThreadTimeOut(true); // allow core threads to time out

        List<Future<Integer>> futures = new ArrayList<>();

        // since the task size is 7, one task will be rejected.
        for (int i = 1; i <= 7; i++) {
            Future<Integer> future = executor.submit(new CallableTask(i));
            futures.add(future);
        }

        // Wait for all tasks to complete and print results
        for (Future<Integer> future : futures) {
            try {
                if (!future.isCancelled()) {
                    Integer result = future.get();
                    System.out.println("Task result: " + result);
                }
            } catch (InterruptedException | ExecutionException e) {
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }

        executor.shutdown();
    }
}


