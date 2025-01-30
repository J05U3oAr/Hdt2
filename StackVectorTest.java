/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de datos
 * Ing. Douglas Barrios
 * Colaboradores: 
 * Marcelo Detlefsen - 24554
 * Denil Parada - 24761
 * Arodi Chavez - 241112
 * Fecha: 30/01/2025
 * Descripción: Pruebas unitarias para la clase StackVector.
 */

 import static org.junit.jupiter.api.Assertions.*;
 import org.junit.jupiter.api.BeforeEach;
 import org.junit.jupiter.api.Test;
 import java.util.EmptyStackException;
 
 public class StackVectorTest {
 
     private StackVector<Integer> stack;
 
     /**
      * Configuración inicial para cada prueba.
      * Se crea un nuevo StackVector antes de cada test.
      */
     @BeforeEach
     public void setUp() {
         stack = new StackVector<>();
     }
 
     /**
      * Prueba para verificar que un elemento se agrega correctamente al stack.
      */
     @Test
     public void testPush() {
         stack.push(10);
         assertEquals(1, stack.size(), "El tamaño del stack debería ser 1 después de un push.");
         assertEquals(10, stack.peek(), "El elemento en la cima debería ser 10.");
     }
 
     /**
      * Prueba para verificar que un elemento se elimina correctamente del stack.
      */
     @Test
     public void testPop() {
         stack.push(20);
         int elemento = stack.pop();
         assertEquals(20, elemento, "El elemento eliminado debería ser 20.");
         assertTrue(stack.empty(), "El stack debería estar vacío después de un pop.");
     }
 
     /**
      * Prueba para verificar que se lanza una excepción al hacer pop en un stack vacío.
      */
     @Test
     public void testPopEmptyStack() {
         assertThrows(ArrayIndexOutOfBoundsException.class, () -> stack.pop(), 
             "Hacer pop en un stack vacío debería lanzar una excepción.");
     }
 
     /**
      * Prueba para verificar que el método peek devuelve el elemento correcto sin eliminarlo.
      */
     @Test
     public void testPeek() {
         stack.push(30);
         int elemento = stack.peek();
         assertEquals(30, elemento, "El elemento en la cima debería ser 30.");
         assertEquals(1, stack.size(), "El tamaño del stack debería seguir siendo 1 después de un peek.");
     }
 
     /**
      * Prueba para verificar que el método empty devuelve true cuando el stack está vacío.
      */
     @Test
     public void testEmptyTrue() {
         assertTrue(stack.empty(), "El stack debería estar vacío inicialmente.");
     }
 
     /**
      * Prueba para verificar que el método empty devuelve false cuando el stack tiene elementos.
      */
     @Test
     public void testEmptyFalse() {
         stack.push(40);
         assertFalse(stack.empty(), "El stack no debería estar vacío después de añadir un elemento.");
     }
 
     /**
      * Prueba para verificar que el método size devuelve el número correcto de elementos.
      */
     @Test
     public void testSize() {
         stack.push(10);
         stack.push(20);
         assertEquals(2, stack.size(), "El tamaño del stack debería ser 2 después de agregar dos elementos.");
     }
 }
 