import java.util.Scanner;

public class QuizProgram {
    public static void main(String [] args){
        System.out.println("Who is the founder of Blue Origin?");
        System.out.println("1) Bill Gates\n2)Tim Cook\n3) Nadella\n4) Jeff Bezos\n5) Exit");
        System.out.println("Enter your choice:");

        while(true){

        Scanner scanner = new Scanner(System.in);
        int selectedOption = scanner.nextInt();
            if(selectedOption==5){
                break;
            }else if(selectedOption == 4){
                System.out.println("Correct!");
                break;
            }else{
                System.out.println("Try again...");
            }


        }
    }
}

