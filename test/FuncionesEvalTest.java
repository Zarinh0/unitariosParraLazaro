import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FuncionesEvalTest {

    // 1. Tests para esPerfecto
    @Test
    void testEsPerfecto() {
        assertTrue(FuncionesEval.esPerfecto(6));   // Caso normal: perfecto
        assertTrue(FuncionesEval.esPerfecto(28));  // Caso normal: perfecto
        assertFalse(FuncionesEval.esPerfecto(10)); // Caso normal: no perfecto
        assertThrows(ArithmeticException.class, () -> FuncionesEval.esPerfecto(0));  // Caso límite: 0
        assertThrows(ArithmeticException.class, () -> FuncionesEval.esPerfecto(-5)); // Caso límite: negativo
    }

    // 2. Tests para getTipoClima
    @Test
    void testGetTipoClima() {
        assertEquals("FRIO", FuncionesEval.getTipoClima(5.0));      //<= 10
        assertEquals("NUBLADO", FuncionesEval.getTipoClima(15.0));  //> 10 y <= 20
        assertEquals("CALUROSO", FuncionesEval.getTipoClima(25.0)); //> 20 y <= 30
        assertEquals("TROPICAL", FuncionesEval.getTipoClima(35.0)); //> 30
    }

    // 3. Tests para invertirArray
    @Test
    void testInvertirArray() {
        // Caso normal
        int[] original = {1, 2, 3};
        int[] esperado = {3, 2, 1};
        assertArrayEquals(esperado, FuncionesEval.invertirArray(original));

        // Caso límite: Array vacío
        int[] vacio = {};
        assertArrayEquals(new int[]{}, FuncionesEval.invertirArray(vacio));

        // Caso límite: Null (debe lanzar excepción según especificación)
        assertThrows(IllegalArgumentException.class, () -> FuncionesEval.invertirArray(null));
    }
}