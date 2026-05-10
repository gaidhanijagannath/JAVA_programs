class MyThread extends Thread{

    public void run(){

        for (int i = 0; i < 5 ; i++) {

            System.out.println(Thread.currentThread().getName());

            /*try {

                //state - blocked state
                Thread.sleep(250);

            } catch (InterruptedException e) {
                System.out.println(e);
            }*/

        }

    }
}


public class ThreadDemo {

    //by default main thread
    public static void main(String[] args) throws Exception {

        //create thread
        //state-born

        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();


        //state - runnable.
        //it will call run() automatically.

        th1.start();

        th2.start();

        th1.join();
        /*it will tell current thread to stop and execute the thread(here th1) which calling join() */


        // th1.run();   V IMP**
        /*
         if we call run() instead of start() thread will not get into thread pool and won't
         be schedule on CPU. hence, making it defunct.
         */

    }

}