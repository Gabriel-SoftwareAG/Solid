package OCP;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Processing Payment...");
    }
}
