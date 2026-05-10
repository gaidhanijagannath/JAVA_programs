public class Records {
    public static void main(String[] args) {

        Person person = new Person("Jagannath","jagannathgaidhani@gmail.com","8698806662");
        System.out.println(person);
        System.out.println(person.name());
    }

    record Person (String name,String email, String phoneNumber){}
    //with this record constructor,public accessor methods,equals,hashcode and toString() are automatically created.
}
