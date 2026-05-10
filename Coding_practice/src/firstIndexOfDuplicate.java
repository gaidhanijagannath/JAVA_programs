import java.util.HashMap;

public class firstIndexOfDuplicate {
    
    public static void main(String[] args) {

        String duplicate = "jaagannath";

        char arr[] = duplicate.toCharArray();
        int i=0;

        HashMap<Character, Integer> findDuplicateIndex = new HashMap<>();

        for ( char c: arr) {

            if(findDuplicateIndex.containsKey(c)){ // already present don't insert
                i++;
                continue;
            }
            findDuplicateIndex.put(c,i++);

        }

        System.out.println(findDuplicateIndex);




        
    }
}