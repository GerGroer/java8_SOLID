package ocp;

public class StudentDiscount implements DiscountPolicy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.15;
    }
}
