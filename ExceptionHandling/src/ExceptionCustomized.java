public class ExceptionCustomized {

    public static void main(String[] args) throws CustomException {

        throw new CustomException("Handling the custom exception.");

    }

}

class CustomException extends Exception {

    CustomException(String str){
        super(str);
    }
}
