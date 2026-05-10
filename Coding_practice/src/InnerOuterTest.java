class Outer{

    public int outerNum = 1000;

     class Inner {

        public int InnerNum = 999;

        Inner(){
            super();
        }

        public int InnerMethod(){

            //returning the outer class variable
            return outerNum; //if inner static class we cant access outer class variables.

        }

    }


    public void OuterMethod(){


    }

}
public class InnerOuterTest {

    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); // if inner class is private we cant do this

        //access inner class from outer
        System.out.println("Accessing Inner from outer - "+inner.InnerNum);


        //access outer class members from inner class.
        System.out.println("Accessing Outer from inner - "+inner.InnerMethod());


    }
}
