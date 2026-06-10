import java.util.*;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.println("Enter width of rectangle: ");
        double width = sc.nextDouble();

        double area = length * width;
        System.out.println("Area of rectangle: " + area);

        sc.close();
    }
}
