package isp.lab5.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        Address address = new Address("Main Street 1", "Cluj-Napoca");
        Customer customer = new Customer("C-100", "Ana Pop", "0700000000", address);

        Product phone = new Product("P-100", "Phone", 799.99, ProductCategory.ELECTRONICS, customer);
        Product game = new Product("P-200", "Puzzle", 19.99, ProductCategory.TOYS, customer);

        Order order = new Order("O-100", java.time.LocalDateTime.now());
        order.addProduct(phone);
        order.addProduct(game);

        OnlineStore store = new OnlineStore("Demo Store");

        System.out.println(customer);
        System.out.println(order);
        System.out.println(store);
    }
}
