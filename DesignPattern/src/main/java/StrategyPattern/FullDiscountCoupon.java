package StrategyPattern;

import java.math.BigDecimal;

// 满减优惠券
public class FullDiscountCoupon extends Coupon {
    private BigDecimal monetaryNeeded;

    public FullDiscountCoupon(String couponCode, String couponName, BigDecimal discount, BigDecimal monetaryNeeded) {
        super(couponCode, couponName, discount);
        this.monetaryNeeded = monetaryNeeded;
    }

    public BigDecimal getMonetaryNeeded() {
        return monetaryNeeded;
    }

    public void setMonetaryNeeded(BigDecimal monetaryNeeded) {
        this.monetaryNeeded = monetaryNeeded;
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal purchaseAmount) {
        if (purchaseAmount.compareTo(monetaryNeeded) < 0) {
            System.out.println("消费金额不足，不能使用优惠券");
            return null;
        } else {
            return purchaseAmount.subtract(this.getDiscount());
        }
    }
}
