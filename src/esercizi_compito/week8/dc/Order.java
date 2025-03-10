package esercizi_compito.week8.dc;

import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products;
    private boolean isCompleted;

    public Order(String orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
        this.isCompleted = false;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    // TODO: dc 2: testare questa funzione
    public void completeOrder() {
        for (Product product : products) {
            product.reduceStock(1);
        }
        isCompleted = true;
    }

    public String getOrderId() {
        return orderId;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public Product getProduct(String productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }
}
