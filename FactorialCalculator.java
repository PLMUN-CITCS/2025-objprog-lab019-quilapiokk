import java.util.Scanner;

public class FactorialCalculator {
    
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        do {
            System.out.print("Enter a non-negative integer: ");
            number = scanner.nextInt();
            
            if (number < 0) {
                System.out.println("Invalid input! Please enter a non-negative integer.");
            }
        } while (number < 0);
        
        return number;
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }

    public static void main(String[] args) {
        int number = getNonNegativeInteger();
        long result = calculateFactorial(number);
        
        System.out.println("The factorial of " + number + " is: " + result);
    }
}
