package StrategyPattern;

import java.math.BigDecimal;

public class StrategyTest {
    public static void main(String[] args) {
        Coupon coupon1 = new PercentageCoupon("0101", "圣诞八八折优惠券",BigDecimal.valueOf(0.88));
        Coupon coupon2 = new AmountCoupon("0201", "无门槛20元优惠券", BigDecimal.valueOf(20));
        Coupon coupon3 = new FullDiscountCoupon("0301",
                                    "满499减50优惠券",
                                        new BigDecimal("50"),
                                        new BigDecimal("499"));

        BigDecimal purchaseAmount = new BigDecimal("100.");
        System.out.println("使用" + coupon1.getCouponName() + "后价格为: "
                            + coupon1.applyDiscount(purchaseAmount) + "元");  // prints 90
        System.out.println("使用" + coupon2.getCouponName() + "后价格为: "
                            + coupon2.applyDiscount(purchaseAmount) + "元");  // prints 20
        coupon3.applyDiscount(purchaseAmount);  // prints "不足"
        purchaseAmount = purchaseAmount.add(new BigDecimal("399"));
        System.out.println("使用" + coupon3.getCouponName() + "后价格为: "
                            + coupon3.applyDiscount(purchaseAmount) + "元");  // prints 449
    }
}
