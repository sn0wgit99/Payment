final class VisaPayment extends CardPayment {
    public VisaPayment(int amount, String currency, String cardNumber) {
        super(amount, currency, cardNumber);
    }

    @Override
    public void processPayment() {
        System.out.println("Payment with VisaCard to amount : " + amount + " " + currency);
    }
}
