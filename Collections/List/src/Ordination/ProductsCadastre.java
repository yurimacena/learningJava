package List.src.Ordination;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductsCadastre {
    private final Set<Product> productSet;

    public ProductsCadastre() {
        this.productSet = new HashSet<>();
    }

    public void addProduct(long code, String name, double price, int quantity) {
        productSet.add(new Product(code, name, price, quantity));
    }

    public Set<Product> showProductsPerName() {
        Set<Product> productsPerName = new TreeSet<>();
        return productsPerName;
    }

    public Set<Product> showProductsPerPrice() {
        Set<Product> productsPerPrice = new TreeSet<>(new ComparatorPerPrice());
        productsPerPrice.addAll(productSet);
        return productsPerPrice;
    }

    public static void main(String[] args) {
        ProductsCadastre productsCadastre = new ProductsCadastre();
        productsCadastre.addProduct(1L, "Product 1", 15d, 5);
        productsCadastre.addProduct(2L, "Product 6", 20d, 10);
        productsCadastre.addProduct(1L, "Product 3", 10d, 2);
        productsCadastre.addProduct(9L, "Product 9", 2d, 2);

        System.out.println(productsCadastre.productSet);
    
        System.out.println(productsCadastre.showProductsPerName());

        System.out.println(productsCadastre.showProductsPerPrice());
    }
}
