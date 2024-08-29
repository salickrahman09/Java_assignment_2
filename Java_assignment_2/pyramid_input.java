import java.util.Scanner;
public class pyramid_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of pyramid lines: ");
        int lines = scanner.nextInt();

        
        for (int i = 1; i <= lines; i++) {
            
            for (int j = lines - i; j > 0; j--) {
                System.out.print(" ");
            }
           
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
           
            System.out.println();
        }

        scanner.close();
    }
}

