import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        // Create the Stack
        Stack <String> myStack = new Stack<>();
        myStack.push("First");
        myStack.push("Second");
        myStack.push("Third");
        myStack.push("Fourth");

        // Print the whole Stack
        System.out.println(myStack);

        System.out.println("Peek: " + myStack.peek());

        // Get a string to check against using the scanner
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please write the word to find...");
        String lineRead = myScanner.nextLine();
        if(myStack.search(lineRead) != -1){
            System.out.println("Line found!");
        }else{
            System.out.println("Sorry, no coincidence.");
        }

        // Print the whole Stack after popping one element
        while(!myStack.isEmpty()){
            System.out.println("My Stack elements: " + myStack);
            myStack.pop();
        }


    }

}
