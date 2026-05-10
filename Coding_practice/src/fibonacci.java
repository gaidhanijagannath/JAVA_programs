public class fibonacci {
    public static void main(String[] args) {

        int seqLength = 10;

        System.out.print("A Fibonacci sequence of " + seqLength + " numbers: ");

        for (int i = 0; i < seqLength; i++) {

            System.out.print(fibonacciSeries(i) + " ");
        }
    }

    public static int fibonacciSeries(int count){

        if(count <= 1)
            return count;

        return fibonacciSeries(count-1) + fibonacciSeries(count-2);

    }
}
