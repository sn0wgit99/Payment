public class testing {
    public static void main(String[] args) {
        Payment visa = new VisaPayment(1488, "USD", "1312110987654321");
        visa.processPayment();

        Payment masterCard = new MasterCardPayment(159, "EUR", "1234567890111213");
        masterCard.processPayment();

        Payment crypto = new CryptoPayment(100000000, "BTC", "Adilet");
        crypto.processPayment();
    }

}
