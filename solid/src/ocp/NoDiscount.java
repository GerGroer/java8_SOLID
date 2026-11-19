package ocp;

public class NoDiscount implements DiscountPolicy {
    @Override
    public double calculateDiscount(double price) {
        return 0.0;
    }
}
