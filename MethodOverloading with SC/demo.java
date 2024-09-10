import java.util.Scanner;

class Calculator {

    // Method to add two integers 
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double numbers
    double add(double a, double b) {
        return a + b;
    }
}

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator math = new Calculator();

 
        System.out.print("Enter two numbers (separated by space): ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Sum of " + num1 + " and " + num2 + ": " + math.add(num1, num2));

        
        System.out.print("Enter three numbers (separated by space): ");
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        System.out.println("Sum of " + num3 + ", " + num4 + ", and " + num5 + ": " + math.add(num3, num4, num5));

      
        System.out.print("Enter two double numbers (separated by space): ");
        double num6 = scanner.nextDouble();
        double num7 = scanner.nextDouble();
        System.out.println("Sum of " + num6 + " and " + num7 + ": " + math.add(num6, num7));

        scanner.close();
    }
}
