package org.sparta.backmaterialspring.payment.services.impl;

import lombok.RequiredArgsConstructor;
import org.sparta.backmaterialspring.payment.entities.Product;
import org.sparta.backmaterialspring.payment.repositories.ProductRepository;
import org.sparta.backmaterialspring.payment.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
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
