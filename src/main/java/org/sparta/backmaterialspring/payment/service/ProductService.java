package org.sparta.backmaterialspring.payment.service;

import org.sparta.backmaterialspring.payment.entity.Product;

import java.util.List;

public interface ProductService {
    /**
     * productId로 product 엔티티를 조회한다.
     * @param productId
     * @return
     */
    Product getProductById(Long productId) throws Exception;
    /**
     * productId로 products 엔티티를 조회한다.
     *
     * @param productIds product entity pk
     * @return products entity
     */
    List<Product> getProductsByIds(List<Long> productIds) throws Exception;
}
