package com.julieta.pruebas;

import com.julieta.conexion.Conexion;
import com.julieta.entidades.Alumno;
import org.hibernate.Session;


import java.util.Calendar;
import java.util.Date;

public class CrearAlumno {
    public static void main(String[] args) {
        Session miSesion = Conexion.leerConexion();
        try {
            miSesion.beginTransaction();
            //SQL: INSERT INTO alumnos (nombre, apellido, fecha_ingreso) VALUES ('Jimena','Gonzalez','2022-09-12');

            //Crear un objeto Date con la fecha actual
            Date fechaHoy = Calendar.getInstance().getTime();
            Alumno nuevoAlumno = new Alumno("Jimena", "Gonzalez", fechaHoy);

            //Guardar el objeto: HIbernate la transforma en una consulta INSERT
            miSesion.save(nuevoAlumno);
            //Confirmar la transaccion (para acciones que modifican datos)
            miSesion.getTransaction().commit();
            System.out.println("Usuario agregado a la tabla");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
