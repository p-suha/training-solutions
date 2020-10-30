package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store orangeStore = new Store("orange");
        Store bananaStore = new Store("banana");

        orangeStore.store(10);
        bananaStore.store(22);

        System.out.println(orangeStore.getProduct() + ": " +orangeStore.getStock());
        System.out.println(bananaStore.getProduct() + ": " +bananaStore.getStock());

        orangeStore.dispatch(5);
        bananaStore.dispatch(2);
        orangeStore.store(10);
        bananaStore.store(10);


        System.out.println(orangeStore.getProduct() + ": " +orangeStore.getStock());
        System.out.println(bananaStore.getProduct() + ": " +bananaStore.getStock());
    }
}
