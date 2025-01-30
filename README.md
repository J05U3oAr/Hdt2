
# Proyecto: Calculadora con Stack en Notación Postfija

## Descripción
Este proyecto implementa una calculadora que evalúa expresiones matemáticas en **notación postfija** utilizando una estructura de datos tipo stack. La calculadora soporta operaciones aritméticas básicas como **suma**, **resta**, **multiplicación**, **división** y **módulo**.

El sistema se compone de varias clases, incluyendo una interfaz `Stack`, una implementación de pila con `StackVector`, la clase `Calculadora`, una clase de pruebas `CalculadoraTest`, y una clase `Main` que ejecuta el programa principal.

---

## Estructura del Proyecto

### Clases principales:
1. **`Stack<E>`**  
   Interfaz que define los métodos básicos de una pila:
   - `push()`: Añadir un elemento.
   - `pop()`: Remover y devolver el elemento en la cima.
   - `peek()`: Devolver el elemento en la cima sin removerlo.
   - `empty()`: Verificar si la pila está vacía.
   - `size()`: Devolver el número de elementos en la pila.

2. **`StackVector<E>`**  
   Implementación de la interfaz `Stack` utilizando un `Vector`.

3. **`Calculadora`**  
   Implementa la lógica para evaluar expresiones en notación postfija.
   - Lee las expresiones y empuja los operandos en la pila.
   - Realiza operaciones basadas en los operadores encontrados (`+`, `-`, `*`, `/`, `%`).
   - Lanza excepciones si encuentra errores como división por cero, operadores desconocidos o expresiones inválidas.

4. **`Main`**  
   Punto de entrada del programa.  
   - Lee un archivo llamado `datos.txt` que contiene expresiones matemáticas en notación postfija.
   - Evalúa cada expresión utilizando la calculadora y muestra los resultados.

5. **`CalculadoraTest`**  
   Pruebas unitarias para verificar el correcto funcionamiento de la clase `Calculadora`.

---

## Formato del Archivo `datos.txt`

El archivo debe contener expresiones en notación postfija, una por línea. Por ejemplo:

```
5 3 +
10 4 -
6 7 *
20 4 /
5 1 2 + 4 * + 3 -
```

---

## Ejemplos de Uso

### Entrada en `datos.txt`:
```
5 3 +
10 4 -
```

### Salida esperada:
```
Expresión: 5 3 + = 8
Expresión: 10 4 - = 6
```

---

## Manejo de Errores

- **División por cero:** Se lanza una excepción `ArithmeticException`.
- **Operador desconocido:** Se lanza una excepción `IllegalArgumentException`.
- **Expresión incompleta o con operandos insuficientes:** Se lanza una excepción `IllegalArgumentException`.

---

## Colaboradores

- **Marcelo Detlefsen** - 24554  
- **Denil Parada** - 24761  
- **Arodi Chavez** - 241112  