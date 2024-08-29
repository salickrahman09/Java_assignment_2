import java.util.Scanner;

public class Days_In_Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month name: ");
        String monthName = scanner.nextLine().trim().toLowerCase();
        scanner.close();
        int days;
        switch (monthName) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                days = 31;
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                days = 30;
                break;
            case "february":
                days = 28; 
                break;
            default:
                days = 0;
                System.out.println("Invalid month name. Please enter a valid month name.");
                return; 
        }
        System.out.println("Number of days in " + monthName.substring(0, 1).toUpperCase() + monthName.substring(1) + ": " + days);
    }
}
