import java.util.*;

public class Hashing {

    public static void main(String[] args) {

        Map<String,Integer> myMap = new HashMap<>();

        myMap.put("India",2);
        myMap.put("China",5);
        myMap.put("US",6);
        myMap.put("India",2); //when trying to add same key it will replace the one exist won't throw error

        myMap.put(null,null); // only 1 null key
        myMap.put(null,5);

        //many null value possible
        myMap.put("Japan",null);
        myMap.put("Canada",null);



        for (Map.Entry<String,Integer> map : myMap.entrySet()) {
            System.out.println("["+map.getKey()+","+map.getValue()+"]");
        }


        /*Map<String,Integer> hMap = new HashMap<>();
        hMap.put("JD",6932);
        hMap.put(null,null);

        //hMap.put(null,null); only one null key allowed
        hMap.put("SG",null); // any number of null values.

        System.out.println(hMap);*/


        /*Map<String,Integer> hMap = new LinkedHashMap<>();
        hMap.put("JD",6932);
        hMap.put("AR",7584);
        hMap.put("SG",6932); // any number of null values.

        System.out.println(hMap);*/

        /*SortedMap<String,Integer> hMap = new TreeMap<>();
        hMap.put("AD",6932);
        hMap.put("SG",null);
        //hMap.put(null,null);


        System.out.println(hMap);*/


    }
}
