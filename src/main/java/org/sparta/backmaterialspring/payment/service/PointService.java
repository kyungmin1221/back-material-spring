package org.sparta.backmaterialspring.payment.service;

import org.sparta.backmaterialspring.auth.entity.UserEntity;

public interface PointService {
    public void usePoint(UserEntity user, int amountToUse, String reason);
}
