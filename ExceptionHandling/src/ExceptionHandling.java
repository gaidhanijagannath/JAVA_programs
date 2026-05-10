public class ExceptionHandling {

    private int j = 9;

    public static void main(String[] args) {

        /*This will remain uncaught by us but after execution IDE, java will caught it. but system will fail and that's
        not what we want.

        #1.Arithmetic Exception
        int i = 9/0;
        System.out.println(i);

        */


         /*
         caught exception
         Thread.sleep(2000);
         */


        /*

        #2.Null-pointer exception.

        ExceptionHandling Exc = new ExceptionHandling();
        Exc = null;

        System.out.println(Exc.j);*/






        try {

            int i = 9/0;

        }catch (ArithmeticException e){
            //if we give wrong class NullPointerException here then it won't catch exception and java will exe its own catch

            System.out.println(e.getMessage());
            e.printStackTrace();

            System.out.println("We can report any message here for user .....");

        }finally {
            /*
             use for clean up code.
            'e.g' if we are opening db connection in try block it will be closed in this block.
            */
            System.out.println("finally... it will get executed anyway if exception is there or not..");
        }


    }


}