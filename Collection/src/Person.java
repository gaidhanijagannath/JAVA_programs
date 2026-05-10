public class Person implements Comparable<Person> {

    private String name;
    private String place;
    private int Age;

    public Person(String name, String place, int Age) {
        this.name = name;
        this.place = place;
        this.Age = Age;
    }

    public String getName() {
        return name;
    }

    public long getAge() {
        return Age;
    }

    public String getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", Age=" + Age +
                '}';
    }

    @Override
    public int compareTo(Person o) {

        //1st way
        if(this.Age > o.Age){ //ASC order
            return 1;
        }else{
            return -1;
        }
        // if DESC order just change exchange the 1 and -1.

        //2nd way
        // instead of above logic we can use  return Integer.compare(this.Age,o.Age); for DESC exchange position

        //3rd way just - Best way
        // return this.Age - o.Age ;




    }
}
