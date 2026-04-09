/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladorr;
import Modelo.Competencia;
import Modelo.Competidor;
import Modelo.Equipo;
import Vista.Vista;

/**
 *
 * @author felip
 */


public class Controlador {

    private Competencia competencia;
    private Vista vista;

    // Constructor
    public Controlador(String nombreEvento) {
        this.competencia = new Competencia(nombreEvento);
        this.vista = new Vista();
    }

    // Agregar equipo a la competencia
    public void agregarEquipo(Equipo e) {
        competencia.agregarEquipo(e);
    }

    // Agregar competidor a un equipo
    public void agregarCompetidor(Equipo e, Competidor c) {
        e.agregarCompetidor(c);
    }

    // Actualizar ranking de un competidor
    public void actualizarRanking(Competidor c, int puntosObtenidos) {
        c.actualizarRanking(puntosObtenidos);
        vista.mostrarMensaje("Ranking actualizado: " + c.obtenerDatos());
    }

    // Mostrar reporte general
    public void mostrarReporte() {
        vista.mostrarReporte(competencia.generarReporte());
    }

    // Mostrar datos de un equipo
    public void mostrarEquipo(Equipo e) {
        vista.mostrarMensaje(e.obtenerDatosEquipo());
    }
}