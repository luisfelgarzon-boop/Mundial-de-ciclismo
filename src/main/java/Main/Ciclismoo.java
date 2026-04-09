/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Controladorr.Controlador;
import Modelo.CiclistaPersecucion;
import Modelo.CiclistaSprint;
import Modelo.Competidor;
import Modelo.Equipo;



/**
 *
 * @author felip
 */
public class Ciclismoo {

    public static void main(String[] args) {

        // Crear controlador con el nombre del evento
        Controlador controlador = new Controlador("Mundial de Ciclismo de Pista - Cali");

        // Crear competidores usando las 2 subclases
        CiclistaSprint c1 = new CiclistaSprint("Carlos Ramirez", 25, "Colombia", 3, 1.75, 68.0, 75.5);
        CiclistaSprint c2 = new CiclistaSprint("Juan Lopez", 23, "Colombia", 7, 1.72, 65.0, 70.0);
        CiclistaPersecucion c3 = new CiclistaPersecucion("Peter Sagan", 30, "Eslovaquia", 1, 1.80, 73.0, 4.0);
        CiclistaPersecucion c4 = new CiclistaPersecucion("Tadej Pogacar", 24, "Eslovenia", 2, 1.76, 66.0, 3.5);

        // Crear equipos
        Equipo equipo1 = new Equipo("Team Colombia", "Colombia");
        Equipo equipo2 = new Equipo("Team Europa", "Europa");

        // Agregar competidores a equipos
        controlador.agregarCompetidor(equipo1, c1);
        controlador.agregarCompetidor(equipo1, c2);
        controlador.agregarCompetidor(equipo2, c3);
        controlador.agregarCompetidor(equipo2, c4);

        // Agregar equipos a la competencia
        controlador.agregarEquipo(equipo1);
        controlador.agregarEquipo(equipo2);

        // Actualizar ranking
        controlador.actualizarRanking(c1, 50);

        // Mostrar toString de cada subclase
        System.out.println("=== Datos con toString ===");
        System.out.println(c1.toString());
        System.out.println(c3.toString());

        // Mostrar sobrecarga con parámetro (estructura anidada)
        System.out.println("\n=== Datos con sobrecarga ===");
        System.out.println(c1.obtenerDatos(3));
        System.out.println(c3.obtenerDatos(4));

        // Mostrar reporte general
        controlador.mostrarReporte();
    }
}
