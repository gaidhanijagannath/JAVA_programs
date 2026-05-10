package ProducerConsumer;

public class ProducerConsumerDemo {

    public static void main(String[] args) {

        SharedQueue queue = new SharedQueue(5);

        Thread producer1 = new Thread(new Producer(queue), "Producer-1");
        Thread producer2 = new Thread(new Producer(queue), "Producer-2");

        Thread consumer1 = new Thread(new Consumer(queue), "Consumer-1");
        Thread consumer2 = new Thread(new Consumer(queue), "Consumer-2");

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }
}