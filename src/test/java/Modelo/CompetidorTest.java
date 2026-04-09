/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author felip
 */
public class CompetidorTest {

    @Test
    public void testConstructor() {
        CiclistaSprint c = new CiclistaSprint("Carlos", 25, "Colombia", 3, 1.75, 68.0, 75.5);
        assertEquals("Carlos", c.getNombre());
        assertEquals(25, c.getEdad());
        assertEquals("Colombia", c.getPais());
        assertEquals(3, c.getRankingMundial());
    }

    @Test
    public void testActualizarRanking() {
        CiclistaSprint c = new CiclistaSprint("Carlos", 25, "Colombia", 3, 1.75, 68.0, 75.5);
        c.actualizarRanking(50);
        assertEquals(50, c.getPuntos());
    }

    @Test
    public void testToString() {
        CiclistaSprint c = new CiclistaSprint("Carlos", 25, "Colombia", 3, 1.75, 68.0, 75.5);
        assertTrue(c.toString().contains("Carlos"));
        assertTrue(c.toString().contains("75.5 km/h"));
    }

    @Test
    public void testObtenerDatosSobrecarga() {
        CiclistaSprint c = new CiclistaSprint("Carlos", 25, "Colombia", 3, 1.75, 68.0, 75.5);
        String resultado = c.obtenerDatos(2);
        assertTrue(resultado.contains("Carrera 1"));
        assertTrue(resultado.contains("Carrera 2"));
    }
}