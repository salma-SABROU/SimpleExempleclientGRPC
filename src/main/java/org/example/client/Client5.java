package org.example.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.example.stub.Bank;
import org.example.stub.BanqueServiceGrpc;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Client5 {
    public static void main(String[] args) throws IOException {
        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",5555)
                .usePlaintext()
                .build();
        BanqueServiceGrpc.BanqueServiceStub asyncStub= BanqueServiceGrpc.newStub(managedChannel);
        Bank.ConvertCurrentRequest request=Bank.ConvertCurrentRequest.newBuilder()
                .setAmout(520.22)
                .setCurrentFrom("MAD")
                .setCurrentTo("AD")
                .build();

        StreamObserver<Bank.ConvertCurrentRequest> performStream = asyncStub.fullStream(new StreamObserver<Bank.ConvertCurrentResponse>() {
            @Override
            public void onNext(Bank.ConvertCurrentResponse convertCurrentResponse) {
                System.out.println("------------------------------");
                System.out.println(convertCurrentResponse);
                System.out.println("------------------------------");
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                System.out.println("END");
            }
        });

        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            int count=0;
            @Override
            public void run() {
                Bank.ConvertCurrentRequest currentRequest=Bank.ConvertCurrentRequest.newBuilder()
                        .setAmout(Math.random()*2000)
                        .build();
                performStream.onNext(currentRequest);
                System.out.println("----counter : "+count);
                ++count;
                if (count==20){
                    performStream.onCompleted();
                    timer.cancel();
                }
            }
        }, 1000, 1000);

        System.out.println(".........");
        System.in.read();
    }

}
