import java.util.*;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pattern Printer");
        System.out.println("1. Half Pyramid");
        System.out.println("2. Inverted Pyramid");
        System.out.println("3. Floyd's Triangle");
        System.out.println("4. Diamond Pattern");
        System.out.print("Choose a pattern (1-4): ");
        
        int choice = sc.nextInt();
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        
        switch (choice) {
            case 1:
                // Half Pyramid
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                // Inverted Pyramid
                for (int i = rows; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                // Floyd's Triangle
                int num = 1;
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(num + " ");
                        num++;
                    }
                    System.out.println();
                }
                break;
            case 4:
                // Diamond Pattern
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= rows - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = rows - 1; i >= 1; i--) {
                    for (int j = 1; j <= rows - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
        
        sc.close();
    }
}