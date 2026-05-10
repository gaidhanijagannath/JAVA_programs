import java.util.Scanner;

class Animal {
    public void move() {
        System.out.println("Animals can move");
    }

}

class Dog extends Animal {

    public void move() {

        //super.move();   // invokes the super class method
        System.out.println("Dogs can walk and run");
    }

    public void barking(){

        System.out.println("Dog barking");
    }

}


public class TestDog {

    public static void main(String args[]) {

        Animal a = new Animal();

        Animal b = new Dog();   // Animal reference but Dog object.
        //in the runtime, JVM figures out the object type and would run the method that belongs to that particular object.

        a.move();   // runs the method in Animal class

        b.move();   // runs the method in Dog class







    }
}