package isp.lab5.exercise1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private String orderId;
    private LocalDateTime date;
    private double totalPrice;
    private List<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public Order(String orderId, LocalDateTime date) {
        this();
        this.orderId = orderId;
        this.date = date;
    }

    public Order(String orderId, LocalDateTime date, List<Product> products) {
        this(orderId, date);
        setProducts(products);
    }

    public boolean addProduct(Product product) {
        if (product == null || products.size() >= 10) {
            return false;
        }
        products.add(product);
        totalPrice += product.getPrice();
        return true;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public void setProducts(List<Product> products) {
        this.products = new ArrayList<>();
        if (products != null) {
            for (Product product : products) {
                if (this.products.size() >= 10) {
                    break;
                }
                if (product != null) {
                    this.products.add(product);
                }
            }
        }
        recalculateTotalPrice();
    }

    private void recalculateTotalPrice() {
        totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
    }

    @Override
    public String toString() {
        return "Order{orderId=" + orderId + ",date=" + date + ",totalPrice=" + totalPrice + ",products=" + products + "}";
    }
}
