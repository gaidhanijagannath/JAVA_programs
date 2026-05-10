package ThreadPool;

import java.util.concurrent.Callable;

class CallableTask implements Callable<Integer> {

    private final int taskId;

    public CallableTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(
                Thread.currentThread().getName()
                        + " started CallableTask : " + taskId
        );

        try {
            Thread.sleep(5000); // simulate work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(
                Thread.currentThread().getName()
                        + " completed CallableTask : " + taskId
        );

        return taskId * 10; // return some result
    }
}
