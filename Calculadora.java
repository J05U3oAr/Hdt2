/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Ing. Douglas Barrios
 * Colaboradores: 
 * Marcelo Detlefsen - 24554
 * Denil Parada - -----
 * Arodi Chavez - -----
 * Fecha: 23/01/2025
 * Descripción: -----
 */

import java.util.Scanner;

public class Calculadora
{
    private Stack<Integer> stack;

    // Constructor
    public Calculadora() 
    {
        stack = new StackVector<>(); // Se usa la implementación con Vector
    }

    public int evaluar(String operacion) {
        Scanner scanner = new Scanner(operacion);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                stack.push(scanner.nextInt()); // Push del operando
            } else {
                // Operador encontrado, hacer pop de dos operandos
                String operador = scanner.next();
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Expresión inválida: no hay suficientes operandos.");
                }
                int operandoB = stack.pop();
                int operandoA = stack.pop();
                stack.push(operar(operandoA, operandoB, operador));
            }
        }

        // Después del cálculo, el resultado debe ser el único elemento en la pila
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Expresión inválida o incompleta.");
        }
        return stack.pop();
    }

    private int operar(int operandoA, int operandoB, String operador) {
        switch (operador) {
            case "+": return operandoA + operandoB;
            case "-": return operandoA - operandoB;
            case "*": return operandoA * operandoB;
            case "/":
                if (operandoB == 0) throw new ArithmeticException("División por cero.");
                return operandoA / operandoB;
            case "%": return operandoA % operandoB;
            default:
                throw new IllegalArgumentException("Operador desconocido: " + operador);
        }
    }
} 