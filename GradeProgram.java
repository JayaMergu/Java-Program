import java.util.Scanner;
public class GradeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter the grade (or type 'exit' to end): ");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            char grade = input.toUpperCase().charAt(0);
            switch (grade) {
                case 'A':
                    System.out.println("Excellent!");
                    break;
                case 'B':
                    System.out.println("Good job!");
                    break;
                case 'C':
                    System.out.println("Satisfactory.");
                    break;
                case 'D':
                    System.out.println("Needs improvement.");
                    break;
                case 'F':
                    System.out.println("Fail. Keep working hard!");
                    break;
                default:
                    System.out.println("Invalid input. Please enter A, B, C, D, or F.");
                    break;
            }
        } while (true);
        System.out.println("Program ended. Goodbye!");
        scanner.close();
    }
}
