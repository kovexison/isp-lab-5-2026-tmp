package isp.lab5.exercise4;

public class SimplePaymentGateway implements PaymentGateway {
    @Override
    public boolean processPayment(User user, double amount) {
        System.out.println("Processing payment of " + amount + " for " + user.getName());
        return true;
    }
}
