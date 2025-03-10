package esercizi_compito.week8.dc;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    // TODO: implementare test 1 e 4
    private final Store store = new Store();

    @Test
    void testAddProduct() {
        Product product1 = new Product("Product", "P1", 10, 3);
        store.addProduct(product1);
        assertTrue(store.getInventory().contains(product1));
    }

    @Test
    void testRemoveProduct() {
        Product product1 = new Product("Product", "P1", 10, 3);
        store.addProduct(product1);
        assertTrue(store.getInventory().contains(product1));

        store.removeProduct(product1);
        assertFalse(store.getInventory().contains(product1));
    }

    @Test
    void testRemoveProduct2() {
        Product product1 = new Product("Product", "P1", 10, 3);
        Product product2 = new Product("Product", "P2", 10, 3);
        store.addProduct(product1);
        store.removeProduct(product2);

        assertFalse(store.getInventory().contains(product2));
    }

    @Test
    void testGetOrder() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Product", "P1", 10, 3));
        products.add(new Product("Product", "P2", 15, 4));

        Order order1 = new Order("4344234", products);
        store.addOrder(order1);

        assertEquals(order1, store.getOrder(order1.getOrderId()));
    }

    @Test
    void testGetOrder2() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Product", "P1", 10, 3));
        products.add(new Product("Product", "P2", 15, 4));

        Order order1 = new Order("4344234", products);
        store.addOrder(order1);

        assertNull(store.getOrder("123"));
    }
}