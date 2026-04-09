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

public class EquipoTest {

    @Test
    public void testAgregarCompetidor() {
        Equipo equipo = new Equipo("Team Colombia", "Colombia");
        CiclistaSprint c = new CiclistaSprint("Carlos", 25, "Colombia", 3, 1.75, 68.0, 75.5);
        equipo.agregarCompetidor(c);
        assertEquals(1, equipo.getCompetidores().size());
    }

    @Test
    public void testObtenerDatosEquipo() {
        Equipo equipo = new Equipo("Team Colombia", "Colombia");
        CiclistaSprint c = new CiclistaSprint("Carlos", 25, "Colombia", 3, 1.75, 68.0, 75.5);
        equipo.agregarCompetidor(c);
        assertTrue(equipo.obtenerDatosEquipo().contains("Team Colombia"));
        assertTrue(equipo.obtenerDatosEquipo().contains("Carlos"));
    }

    @Test
    public void testIntegracionCompetencia() {
        Competencia competencia = new Competencia("Mundial Cali");
        Equipo equipo = new Equipo("Team Colombia", "Colombia");
        CiclistaPersecucion c = new CiclistaPersecucion("Pedro", 28, "Colombia", 5, 1.78, 70.0, 4.0);
        equipo.agregarCompetidor(c);
        competencia.agregarEquipo(equipo);
        assertTrue(competencia.generarReporte().contains("Mundial Cali"));
        assertTrue(competencia.generarReporte().contains("Pedro"));
    }
}