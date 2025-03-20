abstract class Payment implements Payable {
    int amount;
     String currency;

    public Payment(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public final String getDetails() {
        return "Сумма: " + amount + " " + currency;
    }

    public abstract void processPayment();
}
