import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        SortedSet<Person> mySortedSet = new TreeSet<>();

        mySortedSet.add(new Person("JD","Nasik",23));
        mySortedSet.add(new Person("JD","Nasik",27));
        mySortedSet.add(new Person("JD","Nasik",24));
        mySortedSet.add(new Person("JD","Nasik",19));


        Iterator<Person> itr = mySortedSet.iterator();
        while (itr.hasNext()){

            System.out.println(itr.next());
        }

        //System.out.println(mySortedSet);


        NavigableSet<Integer> set = new TreeSet<>();

        set.add(1);
        set.add(8);
        set.add(5);
        set.add(3);
        set.add(0);
        set.add(22);
        set.add(10);

        System.out.println("Original NavigableSet: " + set);

        NavigableSet<Integer> rset = set.descendingSet();

        System.out.println("Reverse order of the original NavigableSet: " + rset);


    }

}
