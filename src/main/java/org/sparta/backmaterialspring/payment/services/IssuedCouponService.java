package org.sparta.backmaterialspring.payment.services;

public interface IssuedCouponService {
    /**
     * 발급된 쿠폰을 사용처리한다
     * @param couponId coupon entity pk
     */
    public void useCoupon(Long couponId) throws Exception;
}
