package com.study.grpcjava.service;

import com.study.grpcjava.entity.ProductEntity;
import com.study.grpcjava.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductEntity add(ProductEntity product) {
        return productRepository.save(product);
    }
}
