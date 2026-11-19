package ocp;

public class VipDiscount implements DiscountPolicy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.10;
    }
}
