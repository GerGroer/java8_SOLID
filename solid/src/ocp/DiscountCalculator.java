package ocp;

public class DiscountCalculator {
    public double calculateDiscount(DiscountPolicy policy, double price) {
        return policy.calculateDiscount(price);
    }
}
