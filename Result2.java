import java.util.Scanner;

class Result2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.println("Enter 1 to continue to check grades, 2 to exit");
            input = sc.nextInt();

            if (input == 1) {
                System.out.println("Enter grades");
                char grades = sc.next().charAt(0);
                switch (grades) {
                    case 'A':
                        System.out.println("Excellent");
                        break;
                    case 'B':
                        System.out.println("Very good");
                        break;
                    case 'C':
                        System.out.println("Good");
                        break;
                    case 'D':
                        System.out.println("Average");
                        break;
                    case 'F':
                        System.out.println("Fail");
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;
                }
            } else if (input != 2) {
                System.out.println("Wrong input, please enter 1 or 2");
            }
        } while (input != 2);
    }
}
