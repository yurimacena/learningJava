package Map;

import java.util.HashMap;
import java.util.Map;

public class StockProducts {
    private final Map<Long, Product> stockProductsMap;

    public StockProducts() {
        this.stockProductsMap = new HashMap<>();
    }

    public void addProduct(long code, String name, int quantity, double price) {
        stockProductsMap.put(code, new Product(name, price, quantity));
    }

    public void showProducts() {
        System.out.println(stockProductsMap);
    }

    public double calculateStockTotalValue() {
        double stockTotalValue = 0d;
        if (!stockProductsMap.isEmpty()) {
            for (Product p : stockProductsMap.values()) {
                stockTotalValue = p.getQuantity() * p.getPrice();
            }
        }
        return stockTotalValue;
    }

    public Product obtainMostExpensiveProduct() {
        Product mostExpensiveProduct = null;
        double highestPrice = Double.MIN_VALUE;
        for (Product p: stockProductsMap.values()) {
            if (p.getPrice() > highestPrice) {
                mostExpensiveProduct = p;
            }
        }
        return mostExpensiveProduct;
    }

    public static void main(String[] args) {
        StockProducts stock = new StockProducts();
        stock.showProducts();

        stock.addProduct(0, "Product 1", 10, 5.0);
        stock.addProduct(1, "Product 2", 5, 10.0);
        stock.addProduct(2, "Product 3", 2, 15.0);
        stock.addProduct(3, "Product 4", 2, 15.0);
        
        stock.showProducts();

        System.out.println("Stock total value: R$ " + stock.calculateStockTotalValue());
        System.out.println("Most expensive product: " + stock.obtainMostExpensiveProduct());
    }
}