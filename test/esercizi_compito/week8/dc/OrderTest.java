package esercizi_compito.week8.dc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    // TODO: implementare test 2

    @Test
    void testCompleteOrder() {
        Product product1 = new Product("1", "Product 1", 10, 10);
        Product product2 = new Product("2",  "Product 2", 15, 20);
        int quantitaProdotto1 = product1.getStockQuantity();
        int quantitaProdotto2 = product2.getStockQuantity();
        Order order = new Order("1", List.of(product1, product2));

        order.completeOrder();
        assertTrue(order.getIsCompleted());
        assertEquals(quantitaProdotto1 - 1, order.getProduct(product1.getProductId()).getStockQuantity());
        assertEquals(quantitaProdotto2 - 1, order.getProduct(product2.getProductId()).getStockQuantity());
    }

    @Test
    void testCompleteOrder1() {
        Product product1 = new Product("1", "Product 1", 10, 0);
        Product product2 = new Product("2", "Product 2", 15, 1);
        int quantitaProdotto1 = product1.getStockQuantity();
        int quantitaProdotto2 = product2.getStockQuantity();
        Order order = new Order("1", List.of(product1, product2));
        assertThrows(IllegalArgumentException.class, () -> order.completeOrder());
    }


}