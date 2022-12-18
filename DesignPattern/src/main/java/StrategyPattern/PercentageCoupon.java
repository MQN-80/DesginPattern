package StrategyPattern;

import java.math.BigDecimal;

// 打折优惠券
public class PercentageCoupon extends Coupon {
    public PercentageCoupon(String couponCode, String couponName, BigDecimal discount) {
        super(couponCode, couponName, discount);
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal purchaseAmount) {
        return purchaseAmount.multiply(this.getDiscount());
    }
}
