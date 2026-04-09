/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author felip
 */
public class CiclistaSprint extends Competidor {

    private double velocidadMaxima;

    // Constructor
    public CiclistaSprint(String nombre, int edad, String pais, int rankingMundial, 
                          double estatura, double peso, double velocidadMaxima) {
        super(nombre, edad, pais, rankingMundial, estatura, peso);
        this.velocidadMaxima = velocidadMaxima;
    }

    // Getter y Setter
    public double getVelocidadMaxima() { return velocidadMaxima; }
    public void setVelocidadMaxima(double velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }

    // Sobreescritura de toString usando super
    @Override
    public String toString() {
        return super.obtenerDatos() + " | Velocidad Máx: " + velocidadMaxima + " km/h";
    }

    // Sobrecarga 1 — sin parámetros
    public String obtenerDatos() {
        return toString();
    }

    // Sobrecarga 2 — con parámetro, tiene estructura anidada (for)
    public String obtenerDatos(int cantidadCarreras) {
        String resultado = toString() + "\n";
        for (int i = 1; i <= cantidadCarreras; i++) {
            resultado += "  Carrera " + i + ": participó\n";
        }
        return resultado;
    }
}
