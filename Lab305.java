import java.util.Scanner;
public class Lab305 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstnum = sc.nextInt();

        System.out.print("Enter the second number: ");
        int secondnum = sc.nextInt();

        for (int i = firstnum; i <= secondnum; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = firstnum; i <= secondnum; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
