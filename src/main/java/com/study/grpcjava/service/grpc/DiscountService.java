package com.study.grpcjava.service.grpc;

import com.example.grpc.Discount;

public interface DiscountService {

    Discount.DiscountResponse getDiscount(Discount.DiscountRequest request);
}
