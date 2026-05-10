import java.util.*;
import java.util.stream.Collectors;

public class HashMaps {

    public static void main(String[] args) {

        String str = "AAAABBBBBBBCCCCCCCCCCCCC";

        String[] charArr = str.split("");
        List<String> charList = Arrays.asList(charArr);

        System.out.println(charList);

        Map<String, Integer> CharListMap = new HashMap<>();


        for (String st : charList) {

            Integer value = CharListMap.get(st);

            if (CharListMap.containsKey(st))
                CharListMap.put(st, ++value);

            else
                CharListMap.put(st, 1);


        }

        /*
        Integer maxChar = Integer.MIN_VALUE;
        String findChar = "";
        for (Map.Entry<String, Integer> map : CharListMap.entrySet()) {

            if(map.getValue() > maxChar) {
                maxChar = map.getValue();
                findChar = map.getKey();
            }
        }

        System.out.println(findChar);*/


        // Java 8 way
        System.out.println(Collections.max(CharListMap.entrySet(), Map.Entry.comparingByValue()).getKey());

    }
}
