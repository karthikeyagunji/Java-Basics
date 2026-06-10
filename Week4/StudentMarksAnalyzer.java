import java.util.*;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        int[] marks = new int[n];
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        System.out.println("Enter marks for " + n + " students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
            if (marks[i] > max) max = marks[i];
            if (marks[i] < min) min = marks[i];
        }
        
        double average = (double) total / n;
        
        System.out.println("\n--- Student Marks Analysis ---");
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
        System.out.println("Highest marks: " + max);
        System.out.println("Lowest marks: " + min);
        
        System.out.println("\nGrades:");
        for (int i = 0; i < n; i++) {
            char grade;
            if (marks[i] >= 90) grade = 'A';
            else if (marks[i] >= 75) grade = 'B';
            else if (marks[i] >= 60) grade = 'C';
            else if (marks[i] >= 45) grade = 'D';
            else grade = 'F';
            System.out.println("Student " + (i+1) + ": " + marks[i] + " -> Grade " + grade);
        }
        
        sc.close();
    }
}