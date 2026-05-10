public class SwitchExpression {


    public static String dayOfTheWeek(int day){

        String dayOfTheWeek = "" ;
        switch (day){

            case 1 : dayOfTheWeek="Sunday";break;
            case 2 : dayOfTheWeek="Monday";break;
            case 3 : dayOfTheWeek="Tuesday";break;
            case 4 : dayOfTheWeek="Wednesday";break;

            default : throw new IllegalArgumentException("Invalid day entered - " +day);
        }

        return dayOfTheWeek;

    }

    //JDK 14 improvement.
    public static String findDayOfTheWeek(int day){

        String dayOfTheWeek =
        switch (day){

            case 1 -> {
                System.out.println("Executing Complex logic in Switch expression.");
                yield "Sunday";
            }
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            default -> throw new IllegalArgumentException("Invalid day entered - " +day);

        };

        return dayOfTheWeek;

    }

    public static void main(String[] args) {

        System.out.println(findDayOfTheWeek(2));







    }

}
