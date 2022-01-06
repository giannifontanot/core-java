/*
This class demonstrates the use of arrays
 */
public class StudentRegistration {

    public static void main(String [] args) {

        Student [] studentArray = new Student[5];

        studentArray[0] = new Student(121,"Juan");
        studentArray[1] = new Student(122, "Pedro");
        studentArray[2] = new Student(123, "Carlos");
        studentArray[3]= new Student(124, "Paco");
        studentArray[4]= new Student(125,"Marcos");

        for(Student student:studentArray){
            System.out.println(student.id + " " + student.name);
        }
    }
}

class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}