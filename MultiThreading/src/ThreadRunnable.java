class ThreadRun implements Runnable{


    // 2nd way of calling run() method.
    /*public ThreadRun() {

        new Thread(this).start();
    }*/

    @Override
    public void run() {

        System.out.println("Thread 1");

    }
}

public class ThreadRunnable {

    public static void main(String[] args) {

        /*Remember we don't have start() method with us now to call bec it was method of Thread class which
        we were extending but, now we are using runnable interface.*/

        // th1 3 ways we can implement.

        //1)class implementation
        Thread th = new Thread(new ThreadRun()); //pass obj of your class to Thread class.


        //lambda ways! easy :) implementing runnable interface.
        //2)
        /*
        Thread th1 = new Thread(()->{
            System.out.println("Thread 2");
        });*/

        //3)
        Runnable runnable = () -> System.out.println("Thread 2");
        Thread th1 = new Thread(runnable);


        th.start();
        th1.start();




    }
}
