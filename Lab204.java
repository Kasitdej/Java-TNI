import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);

        System.out.print("Input hour: ");
        int hour = Integer.parseInt(scanner.next());
        scanner.nextLine();
        System.out.print("Input minute: ");
        int minute = Integer.parseInt(scanner.nextLine());

        int hourtomin = hour * 60;
        int totalminute = hourtomin + minute;

        System.out.print("Total time is " + totalminute + " minutes");
    }
}
