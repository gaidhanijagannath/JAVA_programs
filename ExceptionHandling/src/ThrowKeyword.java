public class ThrowKeyword {

    public static void main(String[] args) {

        /*Throw is for customize (business logic) exception which Java won't provide.*/

        System.out.println("ABC");

        try {
            throw new Exception("Job Switch Exception has occurred.");
            // we can build any logic here and throw the Exception 'e.g' ATM above balance withdrawal.

        } catch (Exception e) {

            System.out.println(e.getMessage());
            System.out.println("PQR");

            //e.printStackTrace();
        }






    }
}
