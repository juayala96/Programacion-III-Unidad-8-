package com.julieta.pruebas;

import com.julieta.conexion.Conexion;
import com.julieta.entidades.Alumno;
import org.hibernate.Session;


public class LeerAlumno {
    public static void main(String[] args) {
        Session miSesion = Conexion.leerConexion();

        try {
            miSesion.beginTransaction();
            //Leer un registro de la tabla alumnos mediante su id
            // SQL: SELECT * FROM alumnos WHERE id = 2;
            Alumno registroAlumno = (Alumno) miSesion.get(Alumno.class,2);
            System.out.println("Alumno: " + registroAlumno.getNombre() + " " + registroAlumno.getApellido());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
