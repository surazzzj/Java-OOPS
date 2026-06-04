public class Payment {
    public void pay() {
        System.out.println("Processing payment...");
    }
}

class UpiPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using UPI.");
    }
}

class CardPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using Card.");
    }
}

class NetBankingPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using Net Banking.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Payment payment;
        payment = new UpiPayment();
        payment.pay();

        payment = new CardPayment();
        payment.pay();

        payment = new NetBankingPayment();
        payment.pay();
    }
}
