public class ThreadDeadlock {

    public static void main(String[] args) {

        final String resource1 = "jagannath";
        final String resource2 = "sandeep";


        /*t1 tries to lock resource1 then resource2 but as t1 is in sleep mode during that time
        then t2 will lock the resource 2 */

        Thread t1 = new Thread(() -> {

            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");

                try { Thread.sleep(100);} catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }

        });

        /*t2 tries to lock resource2 and then resource1(but its already locked) and t2 have to wait for t1 to
        release lock on R1.
        */


        Thread t2 = new Thread(() -> {

            /*
            **Solution to deadlock**
            *
            change order her to avoid deadlock. here when T1 acquires lock on Res 1 after that while T1 sleeps
            T2 tries to acquire lock on Res 1, it won't as its locked.
            so once T1 executes it completely Res 1 and 2 will be available for T2 again.
            *
            * */

            //DEADLOCK creation scenario

           /* synchronized (resource2) { // change to resource 1 - to solve deadlock.
                System.out.println("Thread 2: locked resource 2");

                try { Thread.sleep(100);} catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                synchronized (resource1) { // change to resource 2 - to solve deadlock
                    System.out.println("Thread 2: locked resource 1");
                }
            }*/


            //DEADLOCK resolve scenario.

            synchronized (resource1) {

                System.out.println("Thread 2: locked resource 1");

                try { Thread.sleep(100);} catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");
                }
            }

        });


        t1.start();
        t2.start();


        // To avoid deadlock we have to change the order of locking



    }
}
