package com.julieta.pruebas;

import com.julieta.conexion.Conexion;
import org.hibernate.Session;

public class Plantilla {
    public static void main(String[] args) {
        Session miSesion = Conexion.leerConexion();
        try {
            miSesion.beginTransaction();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
