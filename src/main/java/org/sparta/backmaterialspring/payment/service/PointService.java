package org.sparta.backmaterialspring.payment.service;

import org.sparta.backmaterialspring.payment.entity.Point;

public interface PointService {
    void usePoint(Point point, int amountToUse, String reason);
}
