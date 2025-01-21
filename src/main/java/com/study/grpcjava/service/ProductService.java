package com.study.grpcjava.service;

import com.study.grpcjava.entity.ProductEntity;
import com.study.grpcjava.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductEntity add(ProductEntity product) {
        return productRepository.save(product);
    }

    public List<ProductEntity> getAll() {
        return productRepository.findAll();
    }
}
