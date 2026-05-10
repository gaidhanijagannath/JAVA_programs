public abstract class Bank {


    //below is partial abstraction - some methods abstract some are not
    //hiding implementation logic -> is called Abstraction.


    public abstract void loan(); // abstract - no method body

    /*
    below 2 methods are common for all banks so, we don't need to hide implementation logic hence we can use
    abstract class in business logic.
    */

    //Otherwise if everything needs to be hide use interface with 100% abstraction.

    public void Credit(){
        System.out.println("Bank - Credit");
    }


    public void Debit(){
        System.out.println("Bank - Debit");
    }

}
