import java.util.LinkedList;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

class Main {

    public static void main(String[] args) {

        String encStr  = "11hta 23hts 87ght";
        String[] words = encStr.split(" ");

        String temp = "0";

        for (String str: words) {
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);
                if (Character.isDigit(ch)){
                    temp+=ch;

                }else{
                    sum+=Integer.parseInt(temp);
                    temp="0";
                }
            }

        }

       Queue<Object> QueueSample = new PriorityQueue<Object>();


        QueueSample.add("JDG");
        QueueSample.add(123);

        System.out.println(QueueSample);




    }

}



