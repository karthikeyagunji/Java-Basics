import java.util.*;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = sc.nextInt();

        System.out.println("Enter second number: ");
        int secondNum = sc.nextInt();

        int sum = firstNum + secondNum;
        System.out.println("Sum: " + sum);

        sc.close();
    }
}