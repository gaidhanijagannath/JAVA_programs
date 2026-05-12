package ScheduledExecutor;


import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorDemo {

    public static void main(String[] args) {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);

        Future<?> futureObj = executorService.scheduleAtFixedRate(() -> {
            System.out.printf("Task executed at: %d ms%n", System.currentTimeMillis());
        }, 2, 5, TimeUnit.SECONDS);

        try {
            // Let the task run for 20 seconds}
            Thread.sleep(20000);
            // Cancel the scheduled task
            futureObj.cancel(true);
            System.out.println("Scheduled task cancelled.");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());


        }
    }


}
