import model.Product;
import model.Tax;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> shopping = List.of( new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
                new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
                new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
                new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
                new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
                new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));

        //Calcular el coste total de la compra, incluyendo impuestos
        BigDecimal total = shopping.stream()
                .map(product -> product.price.multiply(BigDecimal.valueOf(1 + product.tax.percent / 100.0)))
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println("Total: " +total +"€");

        //Listar todos los productos que empiezan por “C” de manera ordenada en una lista separada por comas
        String products = shopping.stream()
                .filter(product -> product.name.startsWith("C"))
                .map(product -> product.name)
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println("Products: " +products);
    }
}