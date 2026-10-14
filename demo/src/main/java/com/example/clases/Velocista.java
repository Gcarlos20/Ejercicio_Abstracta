package com.example.clases;

public class Velocista extends Ciclista {
 
    private double potenciaPromedio;        // vatios
    private double velocidadPromedioSprint; // km/h
 
    public Velocista(int identificador, String nombre,
                     double potenciaPromedio, double velocidadPromedioSprint) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }
 
    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }
 
    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }
 
    protected double getVelocidadPromedioSprint() {
        return velocidadPromedioSprint;
    }
 
    protected void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }
 
    @Override
    public String imprimirTipo() {
        return "Es un Velocista";
    }
 
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Potencia promedio: " + potenciaPromedio + " vatios");
        System.out.println("Velocidad promedio en sprint: " + velocidadPromedioSprint + " km/h");
    }
}
 
