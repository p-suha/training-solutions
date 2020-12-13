package introinheritance.basket;

public class ShoppingBasket {

    private Basket basket = new Basket();


    public void addItem(Item item) {
        basket.addItem(item);
    }

    public void removeItem(String barcode) {
        basket.removeItem(barcode);
    }

    public double sumNettoPrice() {
        double nettos = 0.0;

        for (Item i : basket.getItems()) {
            nettos += i.getNettoPrice();

        }
        return nettos;
    }

    public double sumBruttoPrice() {
        double bruttoPrice;
        double sumBruttoPrice = 0.0;
        for (Item i : basket.getItems()) {
            bruttoPrice = i.getNettoPrice() + i.getTaxAmount();

            sumBruttoPrice += bruttoPrice;
        }

        return sumBruttoPrice;
    }

    public double sumTaxValue() {
        double sum = 0.0;

        for (Item i : basket.getItems()) {
            sum += i.getTaxAmount();
        }
        return sum;
    }

    public void checkout() {
        basket.clearBasket();
    }

    public void removeMostExpensiveItem() {
        removeItem(getMostExpensiveItemBarcode());
    }

    private String getMostExpensiveItemBarcode() {
        Item mostExpensiveItem = basket.getItems().get(0);
        for (Item item : basket.getItems()) {
            if (item.getNettoPrice() > mostExpensiveItem.getNettoPrice()) {
                mostExpensiveItem = item;
            }
        }
        return mostExpensiveItem.getBarcode();
    }
}
