public class ThreadLocalVirtualThreads {
    public static void main(String[] args) {

         ThreadLocal<String> threadLocal = new ThreadLocal<>();

        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            threadLocal.set("Value for " + threadName);
            System.out.println(threadName + ": " + threadLocal.get());
        };

        Thread thread1 = new Thread(task, "VirtualThread-1");
        Thread thread2 = new Thread(task, "VirtualThread-2");

        thread1.start();
        thread2.start();
    }
}
