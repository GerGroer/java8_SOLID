package ocp;

public class RegularDiscount implements DiscountPolicy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.05;
    }
}
