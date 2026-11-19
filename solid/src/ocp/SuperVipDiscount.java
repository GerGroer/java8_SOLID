package ocp;

public class SuperVipDiscount implements DiscountPolicy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.20;
    }
}
