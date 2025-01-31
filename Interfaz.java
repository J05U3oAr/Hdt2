/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Ing. Douglas Barrios
 * Colaboradores: 
 * Marcelo Detlefsen - 24554
 * Denil Parada - 24761
 * Arodi Chavez - 241112
 * Fecha: 30/01/2025
 * Descripción: * Interfaz para una calculadora de sufijos.
 * Proporciona métodos para evaluar expresiones de postfix y realizar operaciones.
 */

public interface Interfaz 
{
    int evaluar(String operacion); // Evaluar la operación y devolver el resultado
    int operar(int operandoA, int operandoB, String operador); // Realizar operación con dos operandos
}