import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizationExample {
    public static void main(String[] args) {

        /*only Vector and Hashset is sync be default.
         to make other collections synchronized/thread safe we have to use collections library which has static methods to do that.
         */

        List<String> arrayList = new ArrayList<>();
        arrayList.add("AB");
        arrayList.add("CD");
        arrayList.add("EF");
        arrayList.add("GH");

        /*1) Synchronized collections
            1.done via static method of Collections class.
            2.synchronized collections lock the whole collection.
            for add(), remove() we don't need explicit synchronisation.
            for fetch/travel we do need.

        */


        Collections.synchronizedList(arrayList);

        /* for(String strValue : arrayList)
            System.out.println(strValue);*/




        synchronized (arrayList){

            Iterator<String> itr = arrayList.iterator();
            while (itr.hasNext())
                System.out.println(itr.next());

        }

        /*2)Concurrent Collections
                1.it's a class
                2.all operations are sync, no need of explicit synchronisation.
                e.g ConcurrentHashMap, CopyOnWriteArrayList, and CopyOnWriteHashSet
                3.faster than synchronized collections.
       */

        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();



        copyOnWriteArrayList.add("JDG");
        copyOnWriteArrayList.add("SDG");


        System.out.println(copyOnWriteArrayList);




    }
}
