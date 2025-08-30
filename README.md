# 🚦 Circuit Breaker en Java

Este proyecto demuestra cómo implementar el patrón de diseño **Circuit Breaker** en Java.

## 📂 Estructura
- `CircuitBreaker.java`: Lógica del patrón.
- `RemoteService.java`: Servicio remoto simulado con fallos.
- `ServiceCaller.java`: Cliente que usa el Circuit Breaker.
- `Main.java`: Ejemplo de ejecución.
- `CircuitBreakerTest.java`: Pruebas unitarias con JUnit 5.

## ▶️ Ejecutar
1. Clonar el proyecto:
   ```bash
   git clone https://github.com/tuusuario/circuit-breaker-demo.git
   cd circuit-breaker-demo
   ```
2. Compilar y ejecutar:
   ```bash
   mvn clean package
   mvn exec:java -Dexec.mainClass="com.example.circuitbreaker.Main"
   ```
3. Correr pruebas:
   ```bash
   mvn test
   ```

## 🧪 Resultado esperado
- Al inicio, el circuito está **Closed**.
- Si ocurren 3 fallos consecutivos, pasa a **Open**.
- Después de 5 segundos, entra en **Half-Open**.
- Si la llamada de prueba es exitosa, vuelve a **Closed**.
