package org.sparta.backmaterialspring.payment.service;

import org.sparta.backmaterialspring.auth.entity.UserEntity;
import org.sparta.backmaterialspring.payment.entity.Point;

public interface PointService {
    void usePoint(Point point, UserEntity user, int amountToUse, String reason);
}
