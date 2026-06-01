package isp.lab5.exercise1;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class Exercise1Test {
    @Test
    public void testOrderTotalPrice() {
        Address address = new Address("Street", "City");
        Customer customer = new Customer("C-1", "Ion", "0700000000", address);
        Product product = new Product("P-1", "Book", 25.5, ProductCategory.BEAUTY, customer);

        Order order = new Order("O-1", LocalDateTime.now());
        order.addProduct(product);

        Assert.assertEquals(25.5, order.getTotalPrice(), 0.001);
    }
}
