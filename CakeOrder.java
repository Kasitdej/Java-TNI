import java.util.Scanner;

public class CakeOrder {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Birthday Cake's Details: ");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor : ");
        String flavor = scanner.next();
        System.out.print("How many pounds: ");
        double pound = scanner.nextDouble();


        BirthdayCake order1 = new BirthdayCake(message, pound, flavor, 350);


        System.out.println(order1);


        System.out.println("Cup Cake's Details: ");
        System.out.print("Enter a flavor : ");
        String cup_flavor = scanner.next();
        System.out.print("How many pieces: ");
        int piece = scanner.nextInt();


        CupCake order2 = new CupCake(piece, cup_flavor, 65);

        System.out.println(order2);



        System.out.println("CheeseCake Details:" );
        System.out.print("Enter a flavor : ");
        String CheeseCakeFlavor = scanner.next();

        System.out.print("How many CheeseCake: ");
        int qty = scanner.nextInt();

        System.out.print("Yak ChubTong Mai? (true/false) : ");
        boolean ChubChub = scanner.nextBoolean();


        CheeseCake order3 = new CheeseCake(qty, ChubChub, CheeseCakeFlavor, 55);


        System.out.println(order3);
        System.out.println("Total price = " + (order1.getUnitPrice()*pound + order2.getUnitPrice()*piece
                + order3.getUnitPrice()));
    }

}
