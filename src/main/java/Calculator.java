/*
# Added a Java File for Demonstration of Code Coverage Percentage update on SonarCloud Dashboard
# By ASecurityGuru
# 5/11/2022 11:14 AM IST
*/
public class Calculator {

    // Método que tiene un problema potencial con la entrada y puede lanzar una excepción
    public int addition(String arguments) {

        int sum = 0;
        for (String add : arguments.split("\\+")) {
            // Posible problema: no se maneja la posible NumberFormatException
            sum += Integer.valueOf(add); // Posible error: el valor de entrada podría no ser un entero válido
        }
        // Problema de indentación: el return debería estar dentro del bloque del for
        return sum;
    }

    // Método adicional con problemas para demostrar más errores
    public int subtract(String arguments) {

        // Error: no se maneja la entrada nula y problemas de formato
        int result = 0;
        for (String sub : arguments.split("-")) {
            // Error: uso inapropiado de Integer.parseInt sin manejo de excepciones
            result -= Integer.parseInt(sub); // Posible error: el valor de entrada podría no ser un entero válido
        }

        // Error: la lógica puede no ser correcta, dependiendo del propósito del método
        return result; // Devolver un resultado incorrecto debido a la lógica incorrecta
    }

    // Método adicional con un error de codificación
    public void printHelloWorld() {
        // Error: no hace nada, pero podría tener implicaciones si se espera que imprima algo
        System.out.println("Hello World"); // Posible error de codificación: no hay validación ni manejo de excepciones
    }
}
