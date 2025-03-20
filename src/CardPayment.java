sealed class CardPayment extends Payment permits VisaPayment, MasterCardPayment {
     String cardNumber;

    public CardPayment(int amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        if (cardNumber.length() == 16) {
            System.out.println("Оплата картой " + getClass().getSimpleName() + " выполнена.");
        } else {
            System.out.println("Ошибка: некорректный номер карты.");
        }
    }
}

