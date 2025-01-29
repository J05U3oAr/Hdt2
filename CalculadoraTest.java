import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testOperacionSuma() {
        int resultado = calculadora.evaluar("5 3 +");
        assertEquals(8, resultado, "La operación '5 3 +' debería devolver 8.");
    }

    @Test
    public void testOperacionResta() {
        int resultado = calculadora.evaluar("10 4 -");
        assertEquals(6, resultado, "La operación '10 4 -' debería devolver 6.");
    }

    @Test
    public void testOperacionMultiplicacion() {
        int resultado = calculadora.evaluar("6 7 *");
        assertEquals(42, resultado, "La operación '6 7 *' debería devolver 42.");
    }

    @Test
    public void testOperacionDivision() {
        int resultado = calculadora.evaluar("20 4 /");
        assertEquals(5, resultado, "La operación '20 4 /' debería devolver 5.");
    }

    @Test
    public void testOperacionModulo() {
        int resultado = calculadora.evaluar("10 3 %");
        assertEquals(1, resultado, "La operación '10 3 %' debería devolver 1.");
    }

    @Test
    public void testDivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> calculadora.evaluar("10 0 /"),
            "La operación '10 0 /' debería lanzar una excepción de división por cero.");
    }

    @Test
    public void testExpresionInvalidaFaltanOperandos() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.evaluar("5 +"),
            "La operación '5 +' debería lanzar una excepción de expresión inválida.");
    }

    @Test
    public void testExpresionCompleja() {
        int resultado = calculadora.evaluar("5 1 2 + 4 * + 3 -");
        assertEquals(14, resultado, "La operación '5 1 2 + 4 * + 3 -' debería devolver 14.");
    }

    @Test
    public void testOperadorDesconocido() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.evaluar("5 2 ^"),
            "La operación '5 2 ^' debería lanzar una excepción por operador desconocido.");
    }

    @Test
    public void testExpresionVacia() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.evaluar(""),
            "Una expresión vacía debería lanzar una excepción de expresión inválida.");
    }

    @Test
    public void testExpresionConUnSoloOperando() {
        int resultado = calculadora.evaluar("5");
        assertEquals(5, resultado, "La operación '5' debería devolver 5.");
    }
}
