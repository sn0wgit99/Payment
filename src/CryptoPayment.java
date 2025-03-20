final class CryptoPayment extends Payment {
    String walletAddress;

    public CryptoPayment(int amount, String currency, String walletAddress) {
        super(amount, currency);
        this.walletAddress = walletAddress;
    }

    @Override
    public void processPayment() {
        System.out.println("Payment with cryptocurrency to amount : " + amount + " " + currency + " в кошелек " + walletAddress);
    }
}

