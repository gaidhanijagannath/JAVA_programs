import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'matchingBraces' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY braces as parameter.
     */

    public static List<String> matchingBraces(List<String> braces) {

        List<String> results = new ArrayList<>();

        for (String st: braces) {

            Stack<Character> str = new Stack();
            String ans = "YES";
            String no = "NO";

            boolean answer = true;
            for(int i=0; i<st.length(); i++){
                char ch = st.charAt(i);
                if(ch == '{' || ch == '[' || ch == '('){
                    str.push(ch);
                    continue;
                }
                if(str.isEmpty()){
                    results.add(no);

                }
                if(ch == ')'){
                    if(str.peek() == '('){
                        str.pop();
                    }else{
                        answer = false;
                        break;
                    }
                }
                if(ch == ']'){
                    if(str.peek() == '['){
                        str.pop();
                    }else{
                        answer = false;
                        break;
                    }
                }
                if(ch == '}'){
                    if(str.peek() == '{'){
                        str.pop();
                    }else{
                        answer = false;
                        break;
                    }
                }


            }
            if(!str.isEmpty()){
                answer = false;
            }
            if(answer)
                //return ans;
            results.add(ans);
            else
            results.add(no);

        }

        return  results;
    }


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int bracesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> braces = IntStream.range(0, bracesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = Result.matchingBraces(braces);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

