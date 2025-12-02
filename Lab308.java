import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many number to input: ");
        int totalnum = scanner.nextInt();


        int maxnumber = Integer.MIN_VALUE;
        int minnumber = Integer.MAX_VALUE;
        int evencount = 0;
        int oddcount = 0;


        for (int i = 1; i <= totalnum; i++) {
            System.out.print("Enter number " + i + ": ");
            int currentNumber = scanner.nextInt();


            if (currentNumber > maxnumber) {
                maxnumber = currentNumber;
            }


            if (currentNumber < minnumber) {
                minnumber = currentNumber;
            }


            if (currentNumber % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }

        System.out.println();
        System.out.println("Maximum = " + maxnumber );
        System.out.println("Maximum = " + minnumber );
        System.out.println("Maximum = " + evencount );
        System.out.println("Maximum = " + oddcount );

        scanner.close();
    }
}
