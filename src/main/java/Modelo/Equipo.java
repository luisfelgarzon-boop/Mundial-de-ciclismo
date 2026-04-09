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
public class Equipo {

    private String nombre;
    private String pais;
    private List<Competidor> competidores;

    // Constructor
    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.competidores = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public List<Competidor> getCompetidores() { return competidores; }

    // Agregar competidor al equipo
    public void agregarCompetidor(Competidor c) {
        competidores.add(c);
    }

    // obtenerDatosEquipo - muestra equipo y sus competidores
    public String obtenerDatosEquipo() {
        String resultado = "Equipo: " + nombre + " | País: " + pais + "\n";
        for (Competidor c : competidores) {
            resultado += "  -> " + c.obtenerDatos() + "\n";
        }
        return resultado;
    }

    @Override
    public String toString() {
        return obtenerDatosEquipo();
    }
}

