public class TestBank {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        HDFCBank hdfcBank = new HDFCBank();

        hdfcBank.loan();
        hdfcBank.Debit();
        hdfcBank.Credit();
        hdfcBank.funds();


        //Bank b =new Bank(); abstract class cannot be instantiated but can create reference variable.

        /*reference variable*/
        Bank b = new HDFCBank();

        b.loan();
        b.Debit();
        b.Credit();

        /*
        funds() method not accessible to Bank abstract class reference variable as HDFC wants to implement there new feature.
        its define by HDFC only.
        */
        //b.funds()


        // we declare the static variables and methods in an abstract class.
        // we can make the abstract methods static in Java.
        

    }
}