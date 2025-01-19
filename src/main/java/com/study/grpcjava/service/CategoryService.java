
package com.study.grpcjava.service;

import com.study.grpcjava.entity.CategoryEntity;
import com.study.grpcjava.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryEntity add(CategoryEntity categoryEntity) {
        return categoryRepository.save(categoryEntity);
    }
}
