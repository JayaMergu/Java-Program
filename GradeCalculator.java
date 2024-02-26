/**creating the program of infinite loop in grades */
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a grade (A, B, C, D, or F) or 'exit' to end: ");
            String grade = sc.nextLine();
            if (grade.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            switch (grade.toUpperCase()) {
                case "A":
                    System.out.println("Excellent!");
                    break;
                case "B":
                    System.out.println("Good job!");
                    break;
                case "C":
                    System.out.println("Satisfactory.");
                    break;
                case "D":
                    System.out.println("Needs improvement.");
                    break;
                case "F":
                    System.out.println("Fail. Please try again.");
                    break;
                default:
                    System.out.println("Invalid grade. Please enter A, B, C, D, or F.");
            }
        }
        scanner.close();
    }
}
