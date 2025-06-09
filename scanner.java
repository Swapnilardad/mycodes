import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();  // Read first number

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();  // Read second number

        int sum = num1 + num2;  // Calculate sum

        System.out.println("Sum = " + sum);  // Display result

        input.close();  // Close the scanner
    }
}

