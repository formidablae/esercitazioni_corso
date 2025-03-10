package esercizi_compito.week8.dc;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> inventory;
    private List<Order> orders;

    public Store() {
        this.inventory = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public Store(List<Product> inventory, List<Order> orders) {
        this.inventory = inventory;
        this.orders = orders;
    }

    public List<Product> getInventory() {
        return inventory;
    }

    public void addProduct(Product product) {
        inventory.add(product);
    }

    // TODO: dc 1: testare questa funzione
    public void removeProduct(Product product) {
        inventory.remove(product);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    // TODO: dc 4: testare questa funzione
    public Order getOrder(String orderId) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }


}
