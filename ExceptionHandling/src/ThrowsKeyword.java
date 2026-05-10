public class ThrowsKeyword {
    public static void main(String[] args) /*throws ArithmeticException*/{

       /*
       it's better to use (throws Exception) as its parent class,so we can catch any below exception
       we never know which exception will occur.
       */

        ThrowsKeyword exc = new ThrowsKeyword();

        exc.sum();
    }

    public void sum()/* throws ArithmeticException*/{
        //div();

        //we are handling exception here only and not letting JVM catch it.
        try {
          div();

        }catch (ArithmeticException a){

            System.out.println("Now DIV() is handling exception thrown by her child method = " + a.getMessage());
        }

    }

    public void div() throws ArithmeticException {

        int num = 9/0;
    }
}

/*
 Nesting of throws is happening and nobody is catching div() throwing to sum() throwing to main() Now JVM will
 take responsibility of catching.
 */
