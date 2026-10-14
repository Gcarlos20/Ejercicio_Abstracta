package com.example;

import java.util.Scanner;

import com.example.clases.Contrarrelojista;
import com.example.clases.Equipo;
import com.example.clases.Escalador;
import com.example.clases.Velocista;

public class App {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Ciclosol", "Colombia");

        // Agregar ciclistas de diferentes tipos
        equipo.añadirCiclista(new Velocista(1, "Mateo Rincón", 350.0, 58.5));
        equipo.añadirCiclista(new Escalador(2, "Tomás Sierra", 3.2f, 8.5f));
        equipo.añadirCiclista(new Contrarrelojista(3, "Nicolás Velo", 62.0));
        equipo.añadirCiclista(new Velocista(4, "Samuel Sprint", 340.0, 60.0));

        // Datos del equipo y tiempo total
        equipo.imprimirDatosEquipo();

        // Listar nombres de todos los ciclistas
        equipo.listarNombresCiclistas();

        // Buscar por identificador ingresado por teclado
        System.out.print("\nBuscar ciclista por identificador: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.close();
        equipo.imprimirDatosCiclistaPorId(id);
    }
}
