/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author felip
 */
public class Competencia {

    private String nombreEvento;
    private List<Equipo> equipos;

    // Constructor
    public Competencia(String nombreEvento) {
        this.nombreEvento = nombreEvento;
        this.equipos = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombreEvento() { return nombreEvento; }
    public void setNombreEvento(String nombreEvento) { this.nombreEvento = nombreEvento; }

    public List<Equipo> getEquipos() { return equipos; }

    // Agregar equipo a la competencia
    public void agregarEquipo(Equipo e) {
        equipos.add(e);
    }

    // Generar reporte general de la competencia
    public String generarReporte() {
        String reporte = "=== Competencia: " + nombreEvento + " ===\n";
        for (Equipo e : equipos) {
            reporte += e.obtenerDatosEquipo() + "\n";
        }
        return reporte;
    }

    @Override
    public String toString() {
        return generarReporte();
    }
}

