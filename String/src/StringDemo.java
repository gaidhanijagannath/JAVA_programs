public class StringDemo {

    public static void main(String[] args) {


        String name1 = "Jagannath";

        String name2 = "Jagannath";

        /*
        name1 is reference variable while jagannath is object in String Constant Pool(SCP) so
        when we create name2 it will start referring to jagannath only which avoids new obj creation and save space.
        SCP area cant contain same object.
        */

        String name3 = new String("Jagannath");
        String name4 = new String("Jagannath");

        /* Will this direct to same jagannath in string pool ?? NOPE -> it will create brand-new objects(name3, name 4) outside SCP
         in heap memory
         * */

        // above 4 Strings there will be 3 object creation. as jagannath is constant across all SCP will have one object of jagannath.
        // name 3 and 4 are 2 diff objects in heap


        String name5 = new String("Gaidhani");
        //after this 2 obj more ( 1 heap, 1 SCP)



        System.out.println(name2 == name1); // TRUE they are referring same location.

        System.out.println(name2 == name3); // FALSE diff location.

        System.out.println(name4 == name3); // 2 diff objects.


        /*-----------------------------------------------------------*/
        String x = "abc";
        String y = "abc";

        x.concat(y);
        System.out.println();

        /*

        Output - abc and NOT abcabc that is string immutation means x won't be affected by concat
        operation you have to stored it  or direct print the operation.

        */



        String str = "  jagann ath\t";

        //str = str.strip();

        str = str.strip();

        System.out.println(str);

        /*SECURITY RISKS ??

        * here name1 and accountHolder referring to jagannath what if after done with account validation we change
        * name1 to something else which transfer money to someone else's account.- security failure.
        *

         Here we can see 2 variables(name1 and accountHolder) have access to string literal
         if one of them changes the value of the object(our string), it will be affected the both the reference variables.

         But java won't let that happen as string is immutable.

        *
        * */
        addMoneyToAccount(name1,50000);



    }

    public static void addMoneyToAccount(String accountHolder, int amount){

        //validation.

        // code logic.

    }


}