/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author johann lopez
 */
public class Proyectil {
        // Atributos
    private double velocidad;
    private double angulo;

    // Constructor
    public Proyectil(double velocidad, double angulo) {
        this.velocidad = velocidad;
        this.angulo = angulo;
    }

    // Métodos getters y setters
    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    // Método para calcular el alcance del proyectil
    public double calcularAlcance() {
        // Fórmula simplificada para el alcance de un proyectil
        double radianes = Math.toRadians(angulo);
        return (Math.pow(velocidad, 2) * Math.sin(2 * radianes)) / 9.8;
    }
    // Método principal para pruebas 
    public static void main(String[] args) {
    Proyectil proyectil = new Proyectil(50, 45);
    System.out.println("Velocidad: " + proyectil.getVelocidad());
    System.out.println("Angulo: " + proyectil.getAngulo());
   
    }

        
  }
    

