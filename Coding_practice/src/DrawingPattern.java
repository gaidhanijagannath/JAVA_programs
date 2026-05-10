public class DrawingPattern {

    public static void main(String[] args) {

        int rows = 9;
        int alpha = 64;

        for (int i = 1; i < rows ; i++) {

            //whitespaces to add in each row.
            //int whitespace = rows - i;

            //upside pyramid
            int whitespaceTop = i -1;


            for (int j = 0; j < whitespaceTop ; j++) {
                System.out.print(" ");
            }



            //top pyramid.
            for (int x = 1; x <= rows -i ; x++) {

                //upside pyramid
                System.out.print(x+" ");
                //System.out.print((char)(x+ alpha)+" "); to print alphabet pyramid.


                //System.out.print(j+" ");

            }

            System.out.println();

        }

        for (int k = 2; k < rows ; k++) {

            int whitespaceBottom  = rows - k;


            for (int j = 0; j < whitespaceBottom -1 ; j++) {
                System.out.print(" ");
            }

            //print bottom pyramid
            for (int x = 1; x <= k ; x++) {

                //upside pyramid
                System.out.print(x+" ");

                //System.out.print(j+" ");

            }

            System.out.println();

        }

        for (int l =  1 ; l <= rows ; l++) {

            int whitespace2  = (rows - l)*2;


            for (int j = 1; j < whitespace2 ; j++) {
                System.out.print(" ");
            }

            for (int x = 1 ; x <=l ; x++) {

                System.out.print(x+" ");

            }


            for (int y = l-1 ; y >= 1 ; y--) {

                System.out.print(y+" ");

            }

            System.out.println();



        }






    }
}
