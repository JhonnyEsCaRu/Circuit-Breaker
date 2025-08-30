# 🚦 Circuit Breaker en Java
Este proyecto demuestra el funcionamiento del patrón de diseño **Circuit Breaker** 

## 📖 Descripción
En este proyecto se realiza el proceso de ejecución que ocurre en el patron de diseño  **Circuit Breaker** en el lenguaje Java, cumpliendo con los requisitospara su ejecución 

## 🎯 Objetivos
- Obtener los pasos correcto de ejecución del patron de diseño
- Validar la ejecución del patron

## ▶️ Pasos para Ejecución
1. Clonar el proyecto:
   ```bash
   git clone https://github.com/JhonnyEsCaRu/circuitBraker.git
   cd circuitBraker
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

## 🛠️ Tecnologías Utilizadas
- ☕ **Java 17**
- 🛠️ **Maven** (gestión de dependencias)
- ✅ **JUnit 5** (pruebas unitarias)

## 📂 Arquitectura de Código
- `CircuitBreaker.java`: Lógica del patrón.
- `RemoteService.java`: Servicio remoto simulado con fallos.
- `ServiceCaller.java`: Cliente que usa el Circuit Breaker.
- `Main.java`: Ejemplo de ejecución.
- `CircuitBreakerTest.java`: Pruebas unitarias con JUnit 5.

## 🧪 Resultado 
- Al inicio, el circuito está **Closed**.
- Si ocurren 3 fallos consecutivos, pasa a **Open**.
- Después de 5 segundos, entra en **Half-Open**.
- Si la llamada de prueba es exitosa, vuelve a **Closed**.

## 📝 Conclusión
Dentro de los desarrollo a desarrollar así aseguramos protección a nuestros sistemas