package org.sparta.backmaterialspring.payment.services;

import org.sparta.backmaterialspring.payment.entities.Product;

import java.util.List;

public interface ProductService {
    /**
     * productId로 products 엔티티를 조회한다.
     *
     * @param productIds product entity pk
     * @return products entity
     */
    public List<Product> getProductsByIds(List<Long> productIds);
}
