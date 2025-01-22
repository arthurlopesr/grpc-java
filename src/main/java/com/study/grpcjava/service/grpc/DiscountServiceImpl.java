package com.study.grpcjava.service.grpc;

import com.example.grpc.Discount;
import com.example.grpc.DiscountServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DiscountServiceImpl implements DiscountService {

    private DiscountServiceGrpc.DiscountServiceBlockingStub discountServiceBlockingStub;
    private final ManagedChannel channel;

    public DiscountServiceImpl(@Value("${discount.gpc.host}") String grpcHost,
                               @Value("${grpc.discount-service.port}") int grpcPort) {
        System.out.println("GRPC is running on " + grpcHost + ":" + grpcPort);
        this.channel = ManagedChannelBuilder.forAddress(grpcHost, grpcPort)
                .usePlaintext()
                .build();
        this.discountServiceBlockingStub = DiscountServiceGrpc.newBlockingStub(channel);
    }

    @Override
    public Discount.DiscountResponse getDiscount(Discount.DiscountRequest request) {
        this.discountServiceBlockingStub = DiscountServiceGrpc.newBlockingStub(channel);
        return discountServiceBlockingStub.getDiscount(request);
    }
}
