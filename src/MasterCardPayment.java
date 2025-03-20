final class MasterCardPayment extends CardPayment {
    public MasterCardPayment(int amount, String currency, String cardNumber) {
        super(amount, currency, cardNumber);
    }

    @Override
    public void processPayment() {
        System.out.println("Payment with MasterCard to amount : " + amount + " " + currency);
    }
}
