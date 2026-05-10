import java.util.Base64;
import java.util.Scanner;

class Account {

    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public boolean isSufficientBalance(int withdrawal){

        if(balance >= withdrawal)return true;

        return false;
    }
    public void withdrawMoney(int withdrawAmount){

        balance -= withdrawAmount;
        System.out.println("Withdrawal amount : " +withdrawAmount);
        System.out.println("Current Balance : " + balance);

    }
}

class Customer implements Runnable{

    private String name;
    private Account account;


    public Customer(Account account, String name) {
        this.account = account;
        this.name = name;
    }

    @Override
    public void run() {

        Scanner sc =new Scanner(System.in);

        synchronized (account){

            System.out.println(name + ", Enter money to withdraw : ");
            int amt = sc.nextInt();

            if(account.isSufficientBalance(amt)){

                System.out.println(name);
                account.withdrawMoney(amt);

            }else {

                System.out.println(name + ", Sorry... Insufficient balance .....");
            }

        }

    }
}

public class Synchronization {

    public static void main(String[] args) {

        Account ac = new Account(10000);

        Customer C1 = new Customer(ac,"Raju");
        Customer C2 = new Customer(ac,"Shyam");

        Thread T1 = new Thread(C1);
        Thread T2 = new Thread(C2);

        T1.start();
        T2.start();


    }
}
