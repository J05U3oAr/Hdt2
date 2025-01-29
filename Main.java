/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Ing. Douglas Barrios
 * Colaboradores: 
 * Marcelo Detlefsen - 24554
 * Denil Parada - -----
 * Arodi Chavez - -----
 * Fecha: 30/01/2025
 * Descripción: -----
 */
import java.util.Scanner;

public class Main {
    // Códigos ANSI para colores en la consola
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        boolean ejecutando = true; // Variable para controlar el bucle

        System.out.println(ANSI_CYAN + "\n-----------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "*  ¡Bienvenido a la Calculadora Postfija!   *" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "-----------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Instrucciones:" + ANSI_RESET);
        System.out.println("- Ingresa una expresión en notación postfija (por ejemplo, '3 4 +').");
        System.out.println("- Los números y operadores deben estar separados por espacios.");
        System.out.println("- Operadores soportados: +, -, *, /, %.");
        System.out.println(ANSI_YELLOW + "Ejemplos:" + ANSI_RESET);
        System.out.println("- Para sumar 3 y 4, ingresa: " + ANSI_GREEN + "3 4 +" + ANSI_RESET);
        System.out.println("- Para multiplicar 5 y 2, ingresa: " + ANSI_GREEN + "5 2 *" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "-----------------------------------------------" + ANSI_RESET);

        while (ejecutando) { // Usamos la variable en lugar de true
            System.out.print("\nIngresa una expresión (o escribe 'salir' para terminar): ");
            String expresion = scanner.nextLine();

            // Salir del programa si el usuario escribe "salir"
            if (expresion.equalsIgnoreCase("salir")) {
                ejecutando = false; // Cambiamos la variable para salir del bucle
                System.out.println(ANSI_CYAN + "\n Gracias por usar la Calculadora Postfija" + ANSI_RESET);
            } else {
                try {
                    int resultado = calculadora.evaluar(expresion);
                    System.out.println(ANSI_GREEN + "El resultado de la expresión es: " + resultado + ANSI_RESET);
                } catch (IllegalArgumentException e) {
                    System.out.println(ANSI_RED + "Error: " + e.getMessage() + ANSI_RESET);
                } catch (ArithmeticException e) {
                    System.out.println(ANSI_RED + "Error: " + e.getMessage() + ANSI_RESET);
                }
            }
        }

        scanner.close();
    }
}