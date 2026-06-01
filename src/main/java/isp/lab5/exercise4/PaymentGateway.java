package isp.lab5.exercise4;

public interface PaymentGateway {
    boolean processPayment(User user, double amount);
}
