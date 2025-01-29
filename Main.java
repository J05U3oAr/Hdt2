/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Ing. Douglas Barrios
 * Colaboradores: 
 * Marcelo Detlefsen - 24554
 * Denil Parada - 24761
 * Arodi Chavez - 241112
 * Fecha: 30/01/2025
 * Descripción: -----
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    int resultado = calculadora.evaluar(linea);
                    System.out.println("Expresión: " + linea + " = " + resultado);
                } catch (Exception e) {
                    System.err.println("Error evaluando expresión: " + linea);
                    System.err.println("Motivo: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}