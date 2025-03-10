package esercizi_compito.week8.dc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    // TODO: implementare test 3

    @Test
    void reduceStock() {
        Product product = new Product("1", "Product 1", 10.0, 5);
        product.reduceStock(3);
        assertEquals(2, product.getStockQuantity());
    }

    @Test
    void reduceStock2() {
        Product product = new Product("1", "Product 1", 10.0, 5);
        assertThrows(IllegalArgumentException.class, () -> product.reduceStock(6));
    }
}