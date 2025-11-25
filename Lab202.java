import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {

        Scanner scanner=  new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double num1 = Double.parseDouble(scanner.next());

        scanner.nextLine();
        System.out.print("Enter number 2: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        int summation = (int) (num1 + num2);
        int subtraction = (int) (num1 - num2);
        int multiplication = (int) (num1 * num2);
        double division = (double) num1 / num2;
        int modulus = (int) (num1 % num2);

        System.out.println("Summation = " + summation);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
        System.out.println("Modulus = " + modulus);
    }
}
