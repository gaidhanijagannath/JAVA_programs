package ThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MyRunnableListDemo {

    public static void main(String[] args) {

        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(
                        2,                      // core pool size
                        4,                      // max pool size
                        10,                     // keep alive time
                        TimeUnit.SECONDS,
                        new ArrayBlockingQueue<>(2), // task queue
                        Executors.defaultThreadFactory(),
                        new ThreadPoolExecutor.CallerRunsPolicy()
                );

        executor.allowCoreThreadTimeOut(true); // allow core threads to time out

        // Create and submit MyRunnable tasks with lists
        for (int i = 1; i <= 3; i++) {
            // Submit the MyRunnable task with start value and size
            // Constructor will initialize and populate the list
            executor.submit(new MyRunnable(i, i * 10, 5));
        }

        executor.shutdown();
        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println("All tasks completed!");
    }
}

/**
 * MyRunnable implementation with a list of integers
 * List is initialized as blank and populated in the constructor
 */
class MyRunnable implements Runnable {

    private final int taskId;
    private final List<Integer> dataList;

    // Constructor that initializes blank list and populates it
    public MyRunnable(int taskId, int startValue, int size) {
        this.taskId = taskId;
        this.dataList = new ArrayList<>(); // blank list initialization

        // Add elements to the list in constructor
        for (int i = 0; i < size; i++) {
            this.dataList.add(startValue + i);
        }
    }

    @Override
    public void run() {
        System.out.println(
                Thread.currentThread().getName()
                + " started MyRunnable Task : " + taskId
                + " with input list: " + dataList
        );

        try {
            Thread.sleep(2000); // simulate work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Process the list and print results
        List<Integer> resultList = new ArrayList<>();
        for (Integer num : dataList) {
            resultList.add(num * 2);
        }

        System.out.println(
                Thread.currentThread().getName()
                + " completed MyRunnable Task : " + taskId
                + " processed list: " + resultList
        );
    }

    // Method to get the data list
    public List<Integer> getDataList() {
        return dataList;
    }

    // Method to get task ID
    public int getTaskId() {
        return taskId;
    }
}



