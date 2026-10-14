package com.example.Main;

import com.example.clases.Contrarrelojista;
import com.example.clases.Equipo;
import com.example.clases.Escalador;
import com.example.clases.Velocista;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear el equipo
        Equipo equipo = new Equipo("Team Colombia", "Colombia");

        // Crear ciclistas de diferentes tipos
        Velocista v = new Velocista(1, "Fernando Gaviria", 1200.0, 68.5);
        v.setTiempoAcumulado(310);

        Escalador e = new Escalador(2, "Egan Bernal", 1.8f, 12.5f);
        e.setTiempoAcumulado(325);

        Escalador e2 = new Escalador(4, "Nairo Quintana", 1.5f, 11.0f);
        e2.setTiempoAcumulado(330);

        Escalador e3 = new Escalador(5, "Miguel Ángel López", 1.6f, 11.5f);
        e3.setTiempoAcumulado(340);

        Contrarrelojista c = new Contrarrelojista(3, "Rigoberto Urán", 55.2);
        c.setTiempoAcumulado(318);
        
        Contrarrelojista c2 = new Contrarrelojista(6, "Sergio Higuita", 54.0);
        c2.setTiempoAcumulado(315);

        // Agregarlos al equipo
        equipo.añadirCiclista(v);
        equipo.añadirCiclista(e);
        equipo.añadirCiclista(e2);
        equipo.añadirCiclista(e3);
        equipo.añadirCiclista(c);
        equipo.añadirCiclista(c2);

        // Datos del equipo (incluye el total de tiempos)
        equipo.imprimirDatosEquipo();
        System.out.println();

        // Listar nombres
        equipo.listarNombresCiclistas();
        System.out.println();

        // Buscar un ciclista por identificador ingresado por teclado
        System.out.print("Ingrese el identificador del ciclista a buscar: ");
        int id = sc.nextInt();
        equipo.imprimirDatosCiclistaPorId(id);

        sc.close();
    }
}
