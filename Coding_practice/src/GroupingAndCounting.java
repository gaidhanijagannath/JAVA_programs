import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupingAndCounting {
    public static void main(String[] args) {


        String str = "apple mango banana banana orange apple pineapple banana";


        String[] fruits = str.split(" ");
        List<String> fruitsList= Arrays.asList(fruits);
        System.out.println(fruitsList);


        HashMap<String,Integer> fruitsPairs = new HashMap<>();

        for (String fruitName: fruitsList) {

            Integer value =  fruitsPairs.get(fruitName);

            if(fruitsPairs.containsKey(fruitName)){
                fruitsPairs.put(fruitName, ++value );

            }else {
                fruitsPairs.put(fruitName, 1);
            }
        }

        for (Map.Entry<String,Integer> fruitsMap : fruitsPairs.entrySet()){
            System.out.println(fruitsMap.getKey()+" "+ fruitsMap.getValue());


        }

    }
}
