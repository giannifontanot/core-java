import java.util.Scanner;

public class FactorialUsingScanner {
    public static void main (String[] args){
    // Read the number form screen
    Scanner scanner = new Scanner(System.in);
    int baseNumber = scanner.nextInt();
    // Execute function
        System.out.println("factorial of " + baseNumber + " is: " + factorial(baseNumber));
    }

    public static int factorial(int baseNumber){
        int factorial =1;
        while(baseNumber>1){
            factorial = baseNumber * factorial;
            baseNumber--;
        }
        return factorial;
    }


}
