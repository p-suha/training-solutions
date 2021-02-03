package ioconvert.products;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

public class ProductWriter {


    public void saveProduct(OutputStream os, List<Product> products) {

        try (PrintStream pw = new PrintStream(os)) {

            for (Product productItem : products) {
                pw.print(productItem.getName());
                pw.print(";");
                pw.print(productItem.getPrice());
                pw.println();
            }

        }
    }
}
