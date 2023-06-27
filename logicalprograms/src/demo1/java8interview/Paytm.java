package demo1.java8interview;

public class Paytm implements UPIPayment{


    @Override
    public String doPayment(String source, String dest) {
        String txDate = UPIPayment.datePatterns("yyyy-MM-DD");
        return null;
    }

    @Override
    public double getScratchCard() {
        return UPIPayment.super.getScratchCard();
    }
}
