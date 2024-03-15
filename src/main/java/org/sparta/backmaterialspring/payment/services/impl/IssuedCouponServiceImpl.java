package org.sparta.backmaterialspring.payment.services.impl;

import lombok.RequiredArgsConstructor;
import org.sparta.backmaterialspring.payment.entities.IssuedCoupon;
import org.sparta.backmaterialspring.payment.repositories.IssuedCouponRepository;
import org.sparta.backmaterialspring.payment.services.IssuedCouponService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IssuedCouponServiceImpl implements IssuedCouponService {
    private final IssuedCouponRepository issuedCouponRepository;

    @Override
    public void useCoupon(Long couponId) throws Exception{
        Optional<IssuedCoupon> couponById = findCouponById(couponId);
        IssuedCoupon issuedCoupon = couponById.orElseThrow(Exception::new);
        issuedCoupon.use();
        issuedCouponRepository.save(issuedCoupon);
    }

    private Optional<IssuedCoupon> findCouponById(Long couponId) {
        return issuedCouponRepository.findById(couponId);
    }
}
