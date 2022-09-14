package com.julieta.pruebas;

import com.julieta.conexion.Conexion;
import com.julieta.entidades.Alumno;
import org.hibernate.Session;

import java.util.List;

public class LeerAlumnoWhere {
    public static void main(String[] args) {
        //1) Leer la conexion
        Session miSesion = Conexion.leerConexion();
        try {
            miSesion.beginTransaction();
            //SQL: SELECT * FROM alumnos WHERE id > 4
            List<Alumno> listaAlumnos = (List<Alumno>) miSesion.createQuery("from Alumno a WHERE a.id > 4").list();
            if(listaAlumnos.isEmpty()) {
                System.out.println("No existen alumnos con el criterio indicado");
            }else{
                for(Alumno a : listaAlumnos){
                    System.out.println(a.getNombre());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
