package ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {

    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity;

    public SharedQueue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            System.out.println(Thread.currentThread().getName() + " waiting, queue full...");
            wait();
        }

        queue.add(value);
        System.out.println(Thread.currentThread().getName() + " produced: " + value);

        notifyAll(); // wake up consumers who are waiting on the object
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println(Thread.currentThread().getName() + " waiting, queue empty...");
            wait();
        }

        int value = queue.poll();
        System.out.println(Thread.currentThread().getName() + " consumed: " + value);

        notifyAll(); // wake up producers
        return value;
    }
}