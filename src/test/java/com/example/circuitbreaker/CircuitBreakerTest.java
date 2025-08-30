package com.example.circuitbreaker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircuitBreakerTest {

    @Test
    void testCircuitOpensAfterFailures() {
        CircuitBreaker breaker = new CircuitBreaker(2, 2000);

        breaker.recordFailure();
        breaker.recordFailure();

        assertEquals("OPEN", breaker.getState());
    }

    @Test
    void testCircuitResetsAfterSuccess() {
        CircuitBreaker breaker = new CircuitBreaker(2, 2000);

        breaker.recordFailure();
        breaker.recordFailure();
        breaker.recordSuccess();

        assertEquals("CLOSED", breaker.getState());
    }
}
