package attributes.bill;

public class BillMain {

    public static void main(String[] args) {

        Bill bill = new Bill();

        bill.addItem(new Item("Termek1", 10, 100));
        bill.addItem(new Item("Termek2", 2, 100));
        bill.addItem(new Item("Termek3", 1, 1000));
        bill.addItem(new Item("Meg egy termek", 4, 33));

        System.out.println(bill.calculateTotalPrice());

    }
}
