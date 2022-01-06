import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args){

        // Create queue
        PriorityQueue<String> myQueue = new PriorityQueue<>();

        myQueue.add("one");
        myQueue.add("two");
        myQueue.add("three");
        myQueue.add("four");
        myQueue.add("five");
        myQueue.add("six");
        myQueue.add("seven");

        System.out.println("myQueue.element(): " + myQueue.element());
        System.out.println("myQueue.peek(): " + myQueue.peek());

        System.out.println("myQueue.add('eight'): " + myQueue.add("eight"));
        System.out.println("myQueue.offer('eight'): " + myQueue.offer("nine"));

        System.out.println("myQueue.element(): " + myQueue.element());
        System.out.println("myQueue.peek(): " + myQueue.peek());

        // There is no guarantee of the order when retrieving the elements
        System.out.println(myQueue);

        // Let's read the contents using an iterator
        Iterator iterator = myQueue.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Let's try using poll
        while(!myQueue.isEmpty()){
            System.out.println(myQueue.poll());
        }

        //Let's try using remove
        while(!myQueue.isEmpty()){
            System.out.println(myQueue.remove());
        }
    }
}
