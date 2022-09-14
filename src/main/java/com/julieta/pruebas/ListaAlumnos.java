package com.julieta.pruebas;

import com.julieta.conexion.Conexion;
import com.julieta.entidades.Alumno;
import org.hibernate.Session;

import java.util.List;

public class ListaAlumnos {
    public static void main(String[] args) {
        //1) Leer la conexion
        Session miSesion = Conexion.leerConexion();

        try {
            //2) Iniciar la transaccion para hacer la consulta
            miSesion.beginTransaction();
            //3) Leer la lista de todos los alumnos de la tabla(en este paso se hace la consulta que necesitemos)
            //SQL: SELECT * FROM alumnos AS a;
            //HQL: from Alumno a
            List<Alumno> listaAlumnos = miSesion.createQuery("from Alumno a").list();
            System.out.println("Alumnos:\n");
            for(Alumno a : listaAlumnos){
                System.out.println(a.getNombre());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
