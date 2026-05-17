import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Producer example: ? extends T (produces data)
        List<Integer> intList = Arrays.asList(1, 2, 3);
        double sum = sumNumbers(intList);
        System.out.println("Sum with integer list: " + sum);

        List<Double> doubleList = Arrays.asList(1.0, 2.0, 3.0);
        double sum1 = sumNumbers(doubleList);
        System.out.println("Sum with double list : " + sum1);


        // Consumer example: ? super T (consumes data)
        List<Number> numList = new ArrayList<>();
        addIntegers(numList, 4, 5, 6);
        System.out.println("List: " + numList);
    }

    // Producer: Use ? extends T when the object produces data of type T  :  means accept Any type that IS-A Number
    /*
    * - Because:
    - we are mainly READING data
    - list is PRODUCING data to us
   -  it guarantee every item is number.
   *  we cant add() as we dont know actual type Integer or Float list  that someone is passing to this method.
*
* */
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    // Consumer: Use ? super T when the object consumes data of type T
    /*
    * Because:
        * list accepts integers from us
        * list CONSUMES data
        * here we know we are adding something higher than Integer os number and object ke under vo consider hoga.
        * as Integer is subclass of Number is subclass of Object.
        * but if we  try to read compiler only know some super class of Integer so hum get karake store nahi kar sakte mostly it
        * would be Object type and we cant cast it to Integer as we dont know actual type of list.
        *           Integer n = list.get(0);  // compile error: incompatible types: Object cannot be converted to Integer, Because actual object may be Object.
        * */
    public static void addIntegers(List<? super Integer> list, int... ints) {
        for (int i : ints) {
            list.add(i);
        }
    }
}