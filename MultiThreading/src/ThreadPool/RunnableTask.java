package ThreadPool;

class RunnableTask implements java.lang.Runnable {

    private final int taskId;

    public RunnableTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {

        System.out.println(
            Thread.currentThread().getName()
            + " started Task : " + taskId
        );

        try {
            Thread.sleep(5000); // simulate work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(
            Thread.currentThread().getName()
            + " completed Task : " + taskId
        );
    }
}