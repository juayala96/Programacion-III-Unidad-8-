package com.julieta.pruebas;

import com.julieta.conexion.Conexion;
import com.julieta.entidades.Alumno;
import com.julieta.entidades.Producto;
import org.hibernate.Session;

import java.util.Calendar;
import java.util.Date;

public class CrearProducto {
    public static void main(String[] args) {
        Session miSesion = Conexion.leerConexion();
        try {
            miSesion.beginTransaction();

            Producto nuevoProducto = new Producto("Yerba Amanda 1 Kg", "Yerba Amanda 1 Kg en paquete industrial",500);

            //Guardar el objeto: HIbernate la transforma en una consulta INSERT
            miSesion.save(nuevoProducto);
            //Confirmar la transaccion (para acciones que modifican datos)
            miSesion.getTransaction().commit();
            System.out.println("Producto agregado a la tabla");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
