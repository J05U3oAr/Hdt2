/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Ing. Douglas Barrios
 * Colaboradores: 
 * Marcelo Detlefsen - 24554
 * Denil Parada - 24761
 * Arodi Chavez - 241112
 * Fecha: 30/01/2025
 * Descripción: Clase de pruebas unitarias para la clase Calculadora.
 * Se utilizan diversas expresiones matemáticas para verificar el correcto
 * funcionamiento de las operaciones aritméticas y el manejo de errores.
 */

 import static org.junit.jupiter.api.Assertions.*;
 import org.junit.jupiter.api.BeforeEach;
 import org.junit.jupiter.api.Test;
 
 public class CalculadoraTest {
 
     private Calculadora calculadora;
 
     /**
      * Configuración inicial para cada prueba.
      * Se crea una nueva instancia de Calculadora antes de cada test.
      */
     @BeforeEach
     public void setUp() {
         calculadora = new Calculadora();
     }
 
     /**
      * Prueba la operación de suma.
      * Verifica que '5 3 +' devuelva 8.
      */
     @Test
     public void testOperacionSuma() {
         int resultado = calculadora.evaluar("5 3 +");
         assertEquals(8, resultado, "La operación '5 3 +' debería devolver 8.");
     }
 
     /**
      * Prueba la operación de resta.
      * Verifica que '10 4 -' devuelva 6.
      */
     @Test
     public void testOperacionResta() {
         int resultado = calculadora.evaluar("10 4 -");
         assertEquals(6, resultado, "La operación '10 4 -' debería devolver 6.");
     }
 
     /**
      * Prueba la operación de multiplicación.
      * Verifica que '6 7 *' devuelva 42.
      */
     @Test
     public void testOperacionMultiplicacion() {
         int resultado = calculadora.evaluar("6 7 *");
         assertEquals(42, resultado, "La operación '6 7 *' debería devolver 42.");
     }
 
     /**
      * Prueba la operación de división.
      * Verifica que '20 4 /' devuelva 5.
      */
     @Test
     public void testOperacionDivision() {
         int resultado = calculadora.evaluar("20 4 /");
         assertEquals(5, resultado, "La operación '20 4 /' debería devolver 5.");
     }
 
     /**
      * Prueba la operación de módulo.
      * Verifica que '10 3 %' devuelva 1.
      */
     @Test
     public void testOperacionModulo() {
         int resultado = calculadora.evaluar("10 3 %");
         assertEquals(1, resultado, "La operación '10 3 %' debería devolver 1.");
     }
 
     /**
      * Prueba el manejo de una división por cero.
      * Verifica que '10 0 /' lance una excepción de tipo ArithmeticException.
      */
     @Test
     public void testDivisionPorCero() {
         assertThrows(ArithmeticException.class, () -> calculadora.evaluar("10 0 /"),
             "La operación '10 0 /' debería lanzar una excepción de división por cero.");
     }
 
     /**
      * Prueba una expresión inválida con operandos insuficientes.
      * Verifica que '5 +' lance una excepción de tipo IllegalArgumentException.
      */
     @Test
     public void testExpresionInvalidaFaltanOperandos() {
         assertThrows(IllegalArgumentException.class, () -> calculadora.evaluar("5 +"),
             "La operación '5 +' debería lanzar una excepción de expresión inválida.");
     }
 
     /**
      * Prueba una expresión compleja.
      * Verifica que '5 1 2 + 4 * + 3 -' devuelva 14.
      */
     @Test
     public void testExpresionCompleja() {
         int resultado = calculadora.evaluar("5 1 2 + 4 * + 3 -");
         assertEquals(14, resultado, "La operación '5 1 2 + 4 * + 3 -' debería devolver 14.");
     }
 
     /**
      * Prueba el manejo de un operador desconocido.
      * Verifica que '5 2 ^' lance una excepción de tipo IllegalArgumentException.
      */
     @Test
     public void testOperadorDesconocido() {
         assertThrows(IllegalArgumentException.class, () -> calculadora.evaluar("5 2 ^"),
             "La operación '5 2 ^' debería lanzar una excepción por operador desconocido.");
     }
 
     /**
      * Prueba el manejo de una expresión vacía.
      * Verifica que una expresión vacía lance una excepción de tipo IllegalArgumentException.
      */
     @Test
     public void testExpresionVacia() {
         assertThrows(IllegalArgumentException.class, () -> calculadora.evaluar(""),
             "Una expresión vacía debería lanzar una excepción de expresión inválida.");
     }
 
     /**
      * Prueba una expresión con un solo operando.
      * Verifica que '5' devuelva 5.
      */
     @Test
     public void testExpresionConUnSoloOperando() {
         int resultado = calculadora.evaluar("5");
         assertEquals(5, resultado, "La operación '5' debería devolver 5.");
     }
 }
 