public class Product {

    String name;
    double price = 0;
    int quantity = 0;

     void addStock(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println("Added " + amount + " items to stock");
        } else {
            System.out.println("Invalid amount!");
        }
    }

     void sell(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println("Sold " + amount + " items");
        } else {
            System.out.println("Not enough items in stock...");
        }
    }

    void changePrice(double newPrice) {
        if (newPrice > 0) {
            price = newPrice;
            System.out.println("Change price to " + newPrice + " baht");
        } else {
            System.out.println("Invalid price!");
        }
    }

    double stockValue() {
        return price * quantity;
    }

    void showInfo() {
        System.out.println("Name  : " + name);
        System.out.println("Price : " + price + " Baht/Item");
        System.out.println("Stock : " + quantity + " Items");
        System.out.println("Stock Value: " + stockValue() + " Baht");
    }
}