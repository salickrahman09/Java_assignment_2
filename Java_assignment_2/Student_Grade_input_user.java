import java.util.Scanner;

public class Student_Grade_input_user {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the student's marks: ");
        int marks = scanner.nextInt();

       
        scanner.close();

        
        int gradeValue;
        if (marks >= 90) {
            gradeValue = 1; // A
        } else if (marks >= 80) {
            gradeValue = 2; // B
        } else if (marks >= 70) {
            gradeValue = 3; // C
        } else if (marks >= 60) {
            gradeValue = 4; // D
        } else {
            gradeValue = 5; // F
        }

       
        if (gradeValue == 1) {
            System.out.println("The student's grade is: A");
        } else if (gradeValue == 2) {
            System.out.println("The student's grade is: B");
        } else if (gradeValue == 3) {
            System.out.println("The student's grade is: C");
        } else if (gradeValue == 4) {
            System.out.println("The student's grade is: D");
        } else {
            System.out.println("The student's grade is: F");
        }
    }
}
