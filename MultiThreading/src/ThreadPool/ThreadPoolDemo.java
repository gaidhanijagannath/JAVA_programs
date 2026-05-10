package ThreadPool;

import java.util.concurrent.*;

public class ThreadPoolDemo {

    public static void main(String[] args) {

        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(

                        2,                      // core pool size
                        4,                      // max pool size
                        10,                     // keep alive time
                        TimeUnit.SECONDS,

                        new ArrayBlockingQueue<>(2), // task queue

                         new CustomThreadFactory(),//Executors.defaultThreadFactory(), we can customize this

                        new CustomRejectedExecutionHandler()//new ThreadPoolExecutor.AbortPolicy() what to do with rejection
                );

        executor.allowCoreThreadTimeOut(true); // allow core threads to time out

        //since the task size is 7 one task will be rejected.
        for (int i = 1; i <= 7; i++) {
            executor.submit(new RunnableTask(i));
        }

        executor.shutdown();
    }

}

class CustomThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(java.lang.Runnable r) {

        Thread thread = new Thread(r);
        // Optional settings
        thread.setDaemon(false);
        thread.setPriority(Thread.NORM_PRIORITY);

        // Global exception handler
        thread.setUncaughtExceptionHandler((t, e) -> {
            System.out.println(
                    "Exception in thread: "
                            + t.getName()
                            + " -> "
                            + e.getMessage()
            );
        });

        return thread;
    }
}

class CustomRejectedExecutionHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(java.lang.Runnable r, ThreadPoolExecutor executor) {
        System.out.println(r.getClass().getName()
                + " rejected");
    }
}