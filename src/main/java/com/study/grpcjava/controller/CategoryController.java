package com.study.grpcjava.controller;

import com.study.grpcjava.entity.CategoryEntity;
import com.study.grpcjava.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public ResponseEntity<CategoryEntity> add(@RequestBody CategoryEntity categoryEntity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.add(categoryEntity));
    }
}
