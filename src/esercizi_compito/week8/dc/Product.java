package esercizi_compito.week8.dc;

public class Product {
    private String productId;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(String productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // TODO: dc 3: testare questa funzione
    public void reduceStock(int quantity) {
        if (quantity > stockQuantity) {
            throw new IllegalArgumentException("Not enough stock");
        }
        stockQuantity -= quantity;
    }

    public void increaseStock(int quantity) {
        stockQuantity += quantity;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public String getProductId() {
        return productId;
    }

}
