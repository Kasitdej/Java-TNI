public class CheeseCake extends Bakery {
    private int quantity;
    private boolean isChub;
    public CheeseCake(int quantity, boolean isChub, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.quantity = quantity;
        this.isChub = isChub;
    }
    public String CheeseCakeType() {
        if (isChub) {
            return "ChubTong Super CheeseCake";
        }
        return "Normal CheeseCake";
    }

    @Override
    public int getPackingCost() {
        if (quantity >= 4) {
            return super.getPackingCost() * 2;
        }
        return super.getPackingCost();
    }

    @Override
    public double calculateTotalPrice() {
        double Chubtong = isChub ? 20 : 0;
        return (quantity * (getUnitPrice() + Chubtong)) + getPackingCost();
    }
    @Override
    public String toString() {
        return super.toString() +
                "\n" + CheeseCakeType() + " (" + getFlavor() + ")" +
                "\nQuantity = " + quantity +
                "\nTotal price of CheeseCake = " + calculateTotalPrice();
    }
}

