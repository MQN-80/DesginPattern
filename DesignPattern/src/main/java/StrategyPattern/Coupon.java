package StrategyPattern;

import java.math.BigDecimal;

// 优惠券的抽象基类
public abstract class Coupon {
    String couponCode;
    String couponName;
    BigDecimal discount;


    public Coupon(String couponCode, String couponName, BigDecimal discount) {
        this.couponCode = couponCode;
        this.couponName = couponName;
        this.discount = discount;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }


    public abstract BigDecimal applyDiscount(BigDecimal purchaseAmount);
}
