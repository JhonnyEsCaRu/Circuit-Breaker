package com.example.circuitbreaker;

public class ServiceCaller {
    private final RemoteService remoteService = new RemoteService();
    private final CircuitBreaker breaker = new CircuitBreaker(3, 5000);

    public String callService() {
        if (!breaker.allowRequest()) {
            return "Circuito abierto - usando fallback";
        }

        try {
            String response = remoteService.call();
            breaker.recordSuccess();
            return response;
        } catch (Exception e) {
            breaker.recordFailure();
            return "Error al llamar al servicio: " + e.getMessage();
        }
    }

    public String getBreakerState() {
        return breaker.getState();
    }
}
