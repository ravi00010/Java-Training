package Day7;

interface UPIPayment {
    void upiTransfer();
}

interface CreditcardPayment {
    void cardTransfer();
}

class Paymentgateway implements UPIPayment, CreditcardPayment {
    public void upiTransfer() {
        System.out.println("UPI Transfer successfull");
    }

    public void cardTransfer() {
        System.out.println("Credit card Payment Successfull");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Paymentgateway pg = new Paymentgateway();
        pg.upiTransfer();
        pg.cardTransfer();
    }

}
