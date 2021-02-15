package week14d02;

import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Orders {

    private Map<String, TreeSet<String>> ordersMap = new HashMap<>();

    public void readFromFile(String source) {

        Path path = Path.of(source);
        try {
            BufferedReader br = Files.newBufferedReader(path);
            String line;

            while ((line = br.readLine()) != null) {
                String[] temp = line.split(" ");
                TreeSet<String> products = new TreeSet<>();
                Collections.addAll(products, temp[1].split(","));
                ordersMap.put(temp[0], products);
            }


        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cant read file", ioe);
        }
    }

    public Map<String, Integer> getProductsMap() {

        Map<String, Integer> productsMap = new HashMap<>();

        for (TreeSet<String> set : ordersMap.values()) {

            for (String item : set) {

                if (!productsMap.containsKey(item)) {
                    productsMap.put(item, 1);
                } else {
                    productsMap.put(item, productsMap.get(item) + 1);
                }
            }
        }

        return productsMap;
    }

    public TreeSet<String> getOrdersById(String id) {
        return ordersMap.get(id);
    }

    public int getProductsCount(String product) {

        return getProductsMap().get(product);
    }

    public int getProductsNumberInOrder(String id) {
        return getOrdersById(id).size();
    }


    //////////////////// MAIN ///////////////////////

    public static void main(String[] args) {
        Orders orders = new Orders();
        orders.readFromFile("orders.txt");

        TreeSet<String> egy = orders.getOrdersById("A10");
        System.out.println(egy);

        System.out.println(orders.getProductsCount("sugar"));

        System.out.println(orders.getProductsNumberInOrder("A312"));

        System.out.println(orders.getProductsMap());
    }

}
