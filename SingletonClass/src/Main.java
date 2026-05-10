class SingletonClass {


    //3 things required for this


    // 1. static member of class,
    private static final SingletonClass st = new SingletonClass();


    // 2. private constructor will avoid obj creation outside class.
    private SingletonClass(){

        System.out.println("Constructor will invoke for only 1 object.");

    }

    // 3. static factory method.
    public static SingletonClass getInstance(){

        return st;
    }

}


public class Main {

    public static void main(String[] args) {


        //SingletonClass st1 = new SingletonClass(); //as constructor is being made private to avoid object creation.

        SingletonClass st1 = SingletonClass.getInstance();

        SingletonClass st2 = SingletonClass.getInstance(); //wil also return same reference as only 1 obj is getting created.


        System.out.println(st1+" "+st2);


    }
}