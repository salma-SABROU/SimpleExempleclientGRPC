package org.example.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.example.stub.Bank;
import org.example.stub.BanqueServiceGrpc;

import java.io.IOException;

public class ClientGrpc {
    public static void main(String[] args) throws IOException {
        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",5555)
                .usePlaintext()
                .build();
        BanqueServiceGrpc.BanqueServiceStub asyncStub= BanqueServiceGrpc.newStub(managedChannel);
        Bank.ConvertCurrentRequest request=Bank.ConvertCurrentRequest.newBuilder()
                .setAmout(56220.22)
                .setCurrentFrom("MAD")
                .setCurrentTo("D")
                .build();
        asyncStub.convert(request, new StreamObserver<Bank.ConvertCurrentResponse>() {
            @Override
            public void onNext(Bank.ConvertCurrentResponse convertCurrentResponse) {
                System.out.println(convertCurrentResponse);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("END ....");

            }
        });
        System.out.println(".........");
        System.in.read();
        }
}
