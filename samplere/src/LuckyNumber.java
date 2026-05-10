import java.util.Scanner;

public class LuckyNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        // initiate array
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = i + 1;
        }

        for (int steps = 2; steps < num/2 ; steps++) {

            int count =0;
            for (int j = 0; j < arr.length ; j++) {

                if(arr[j] !=0) count++;

                if(count % steps == 0){
                    arr[j]=0;
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();


    }
}
