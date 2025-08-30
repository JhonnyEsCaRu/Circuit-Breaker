package com.example.circuitbreaker;

import java.util.Random;

public class RemoteService {
    private final Random random = new Random();

    public String call() throws Exception {
        if (random.nextInt(10) < 6) {
            throw new Exception("Servicio no disponible");
        }
        return "Respuesta exitosa del servicio remoto";
    }
}
