package StrategyPattern;

import java.math.BigDecimal;

// 无门槛金额优惠券
public class AmountCoupon extends Coupon {
    public AmountCoupon(String couponCode, String couponName, BigDecimal discount) {
        super(couponCode, couponName, discount);
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal purchaseAmount) {
        return purchaseAmount.subtract(this.getDiscount());
    }
}
