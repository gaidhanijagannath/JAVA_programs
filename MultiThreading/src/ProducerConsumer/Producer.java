package ProducerConsumer;

class Producer implements Runnable {

    private final SharedQueue queue;

    public Producer(SharedQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int value = 1;
        try {
            while (true) {
                queue.produce(value++);
                Thread.sleep(500); // simulate work
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}