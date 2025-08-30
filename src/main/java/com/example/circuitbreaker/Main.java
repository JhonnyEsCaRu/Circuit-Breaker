package com.example.circuitbreaker;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ServiceCaller caller = new ServiceCaller();

        for (int i = 0; i < 20; i++) {
            System.out.println("Llamada " + (i+1) + ": " + caller.callService()
                    + " | Estado: " + caller.getBreakerState());
            Thread.sleep(1000);
        }
    }
}
