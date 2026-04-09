/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author felip
 */
public class CiclistaPersecucion extends Competidor {

    private double distanciaEspecialidad;

    // Constructor
    public CiclistaPersecucion(String nombre, int edad, String pais, int rankingMundial,
                               double estatura, double peso, double distanciaEspecialidad) {
        super(nombre, edad, pais, rankingMundial, estatura, peso);
        this.distanciaEspecialidad = distanciaEspecialidad;
    }

    // Getter y Setter
    public double getDistanciaEspecialidad() { return distanciaEspecialidad; }
    public void setDistanciaEspecialidad(double distanciaEspecialidad) { 
        this.distanciaEspecialidad = distanciaEspecialidad; 
    }

    // Sobreescritura de toString usando super
    @Override
    public String toString() {
        return super.obtenerDatos() + " | Distancia Especialidad: " + distanciaEspecialidad + " km";
    }

    // Sobrecarga 1 — sin parámetros
    public String obtenerDatos() {
        return toString();
    }

    // Sobrecarga 2 — con parámetro, tiene estructura anidada (for)
    public String obtenerDatos(int cantidadVueltas) {
        String resultado = toString() + "\n";
        for (int i = 1; i <= cantidadVueltas; i++) {
            resultado += "  Vuelta " + i + ": completada\n";
        }
        return resultado;
    }
}
