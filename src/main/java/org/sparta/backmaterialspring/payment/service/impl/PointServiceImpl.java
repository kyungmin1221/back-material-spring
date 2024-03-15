package org.sparta.backmaterialspring.payment.service.impl;

import lombok.RequiredArgsConstructor;
import org.sparta.backmaterialspring.auth.entity.UserEntity;
import org.sparta.backmaterialspring.payment.repository.PointRepository;
import org.sparta.backmaterialspring.payment.service.PointService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PointServiceImpl implements PointService {
    private final PointRepository pointRepository;

    @Override
    public void usePoint(UserEntity user, int amountToUse, String reason) {

    }
}
