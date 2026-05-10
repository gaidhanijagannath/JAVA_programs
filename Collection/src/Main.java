import java.util.*;


public class Main {
    public static void main(String[] args) {


        LinkedList<Person> al = new LinkedList<>();

        al.add(new Person("jagannath","Nasik",1234));
        al.add(new Person("Sachin","Lonawala",5678));

        Iterator<Person> itr = al.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

        //reversing link list
        LinkedList<Person> reverseLL = new LinkedList<>();

        al.descendingIterator().forEachRemaining(reverseLL::add);
        //System.out.println(reverseLL);


        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);

        //System.out.println(ll);

        LinkedList<Integer> ll1 = new LinkedList<>();
        ll.descendingIterator().forEachRemaining(ll1::add);

        //System.out.println(ll1);


        /*

        Stack<String> stack = new Stack<>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();

        Iterator<String> itr1 =stack.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        System.out.println(stack.peek()*//*+""+stack.pop()*//*);*/


       /* PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        queue.add("Simaran");
        queue.add("ibbu hatela");

        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");

        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        queue.remove();
        queue.poll();

        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();

        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }*/



        // Items in an HashSet are actually objects that's why we are using Integer and not  int; ***

        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        //HashSet<Integer> myHashSet = new LinkedHashSet<>(6, 0.5f);


        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11); // This element will be ignored.
        myHashSet.add(45);
        myHashSet.add(67);
        myHashSet.add(35);
        myHashSet.add(87);

        //myHashSet.contains(11);


/*
        myHashSet.add("JD");
*/


        //System.out.println(myHashSet);

       /* Iterator<Integer> itr =myHashSet.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/




    }
}
