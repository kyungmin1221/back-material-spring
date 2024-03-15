package org.sparta.backmaterialspring.payment.service.impl;

import lombok.RequiredArgsConstructor;
import org.sparta.backmaterialspring.payment.entity.Product;
import org.sparta.backmaterialspring.payment.repository.ProductRepository;
import org.sparta.backmaterialspring.payment.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public List<Product> getProductsByIds(List<Long> productIds) {
        return productRepository.findAllById(productIds);
    }
}
