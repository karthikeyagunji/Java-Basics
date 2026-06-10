import java.util.*;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.println("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b );

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);

        sc.close();
    }
}