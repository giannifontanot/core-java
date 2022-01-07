import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        // First, we create a linked list of Strings
        LinkedList <String> myLinkedList = new LinkedList<>();
        myLinkedList.add("one");
        myLinkedList.add("two");
        myLinkedList.add("three");
        myLinkedList.add("four");
        myLinkedList.add("five");
        myLinkedList.add("six");
        myLinkedList.add("seven");
        myLinkedList.add("eight");
        myLinkedList.add("nine");
        myLinkedList.add("ten");

        //Print the contents
        System.out.println(myLinkedList);

        //Print by iterating the contents
        Iterator<String> myIterator =  myLinkedList.iterator();

        while(myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

        Iterator reverseIterator = myLinkedList.descendingIterator();

        while(reverseIterator.hasNext()){
            System.out.println(reverseIterator.next());
        }

    }

}
