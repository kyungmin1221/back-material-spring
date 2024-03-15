package org.sparta.backmaterialspring.payment.service.impl;

import lombok.RequiredArgsConstructor;
import org.sparta.backmaterialspring.payment.entity.IssuedCoupon;
import org.sparta.backmaterialspring.payment.repository.IssuedCouponRepository;
import org.sparta.backmaterialspring.payment.service.IssuedCouponService;
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
