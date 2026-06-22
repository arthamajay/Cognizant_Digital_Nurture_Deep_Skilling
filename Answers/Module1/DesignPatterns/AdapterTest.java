public class AdapterTest {
    public static void main(String[] args) {
        PaymentProcessor stripe=new StripeAdapter(new StripeGateway());
        stripe.processPayment(150.00);

        PaymentProcessor paypal=new PayPalAdapter(new PayPalGateway());
        paypal.processPayment(200.00);
    }
}
