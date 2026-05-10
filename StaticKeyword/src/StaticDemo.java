class Employee {

    private String name;
    private int id;
    protected static String Ceo;
    // irrespective of how many obj you are creating the value will ve same for all.

    //we can use this block to initialize static variable all at once. it will run only once during class loading.
    //it executes before the main method.

    static {

        Ceo="Jagannath Gaidhani";

    }

    public Employee(String name, int id/*, String CEO*/) {
        this.name = name;
        this.id = id;
        /*this.Ceo = CEO;*/
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", CEO='" + Ceo + '\'' +
                '}';
    }

    //inner static class
    /*  get called(once for all) even BEFORE creation of object,
        one for 1 class and objects.
    */
    static class emp {
        protected static int number = 872384;
    }


    public static void display(){

        // System.out.println(name); static method cannot access non-static methods and variables.
        System.out.println(Ceo);

    }

    public void display2(){

        /*
        non-static method does not belong to object it can be called w/o object so static members are accessible and can be
        change inside it.
        */
        System.out.println("static variable accessible inside member function is accessible - "+ Employee.Ceo);


    }



}

public class StaticDemo {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Employee.Ceo = "Jagannath"; // it best practice to assign or call static var with class name.

        Employee E1 = new Employee("A", 1/*, "JD"*/);
        Employee E2 = new Employee("B", 2/*, "DG"*/);

        /*
        here we are initializing Ceo 2 times but in output both E1, E2 will have same value
        means only one copy and latest initialization will work i.e DG.
        */

        System.out.println(E1+"\n"+E2);


        System.out.println(Employee.emp.number);

        Employee.display();

        E1.display2();


    }
}