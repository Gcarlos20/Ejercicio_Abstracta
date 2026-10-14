package com.example.clases;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
 
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo; // suma de tiempos de los ciclistas (minutos)
    private List<Ciclista> ciclistas;
 
    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }
 
    // ----- Métodos protegidos: get y set de cada atributo -----
 
    protected String getNombreEquipo() {
        return nombreEquipo;
    }
 
    protected void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
 
    protected String getPais() {
        return pais;
    }
 
    protected void setPais(String pais) {
        this.pais = pais;
    }
 
    protected int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }
 
    protected void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        Equipo.tiempoTotalEquipo = tiempoTotalEquipo;
    }
 
    // ----- Operaciones del equipo -----
 
    /** Añade un ciclista al equipo. */
    public void añadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
    }
 
    /** Suma los tiempos de carrera de todos los ciclistas y actualiza el atributo estático. */
    public int calcularTiempoTotal() {
        int total = 0;
        for (Ciclista c : ciclistas) {
            total += c.getTiempoAcumulado();
        }
        tiempoTotalEquipo = total;
        return total;
    }
 
    /** Imprime los datos del equipo en pantalla. */
    public void imprimirDatosEquipo() {
        System.out.println("===== Equipo =====");
        System.out.println("Nombre: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Tiempo total del equipo: " + calcularTiempoTotal() + " min");
        System.out.println("Cantidad de ciclistas: " + ciclistas.size());
    }
 
    /** Lista los nombres de todos los ciclistas del equipo. */
    public void listarNombresCiclistas() {
        System.out.println("Ciclistas del equipo " + nombreEquipo + ":");
        if (ciclistas.isEmpty()) {
            System.out.println("  (el equipo no tiene ciclistas)");
            return;
        }
        for (Ciclista c : ciclistas) {
            System.out.println("  - " + c.getNombre());
        }
    }
 
    /** Dado un identificador, imprime los datos del ciclista o un mensaje si no existe. */
    public void imprimirDatosCiclistaPorId(int id) {
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == id) {
                System.out.println(c.imprimirTipo());
                c.imprimirDatos();
                return;
            }
        }
        System.out.println("No existe un ciclista con el identificador " + id);
    }
}
 