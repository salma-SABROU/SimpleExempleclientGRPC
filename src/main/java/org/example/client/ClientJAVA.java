package org.example.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.example.stub.Bank;
import org.example.stub.BanqueServiceGrpc;

public class ClientJAVA {
    public static void main(String[] args) {
        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",5555)
                .usePlaintext()
                .build();
        BanqueServiceGrpc.BanqueServiceBlockingStub blockingStub=BanqueServiceGrpc.newBlockingStub(managedChannel);
        Bank.ConvertCurrentRequest request=Bank.ConvertCurrentRequest.newBuilder()
                .setAmout(56220.22)
                .setCurrentFrom("MAD")
                .setCurrentTo("D")
                .build();
        Bank.ConvertCurrentResponse currentResponse=blockingStub.convert(request);
        System.out.println("Response froom the web services : "+currentResponse);
    }
}
