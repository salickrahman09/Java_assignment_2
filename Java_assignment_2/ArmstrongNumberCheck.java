public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        int number = 153; 
        int originalNumber = number;
        int numberOfDigits = 0;
        while (originalNumber != 0) {
            originalNumber /= 10;
            numberOfDigits++;
        }
        originalNumber = number;
        int sum = 0;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            int power = 1;
            for (int i = 0; i < numberOfDigits; i++) {
                power *= digit; 
            }
            sum += power;
            originalNumber /= 10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
