import java.util.Scanner;

public class table_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for which you want to print the multiplication table: ");
        int number = scanner.nextInt();
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }
        scanner.close();
    }
}
