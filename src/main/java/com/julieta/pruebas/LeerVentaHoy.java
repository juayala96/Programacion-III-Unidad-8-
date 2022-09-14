package com.julieta.pruebas;

import com.julieta.conexion.Conexion;
import com.julieta.entidades.Producto;
import org.hibernate.Session;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class LeerVentaHoy {
    public static void main(String[] args) {
        //1) Leer la conexion
        Session miSesion = Conexion.leerConexion();
        try {
            miSesion.beginTransaction();
            //Date fechaHoy = Calendar.getInstance().getTime();
            //SQL: SELECT * FROM alumnos WHERE id > 4
            List<Producto> listaProductos = (List<Producto>) miSesion.createQuery("from Producto p WHERE p.fecha_ultima_venta = '2022-09-12'").list();
            if(listaProductos.isEmpty()) {
                System.out.println("No existen productos con el criterio indicado");
            }else{
                System.out.println("Productos vendidos hoy:\n");
                for(Producto p : listaProductos){

                    System.out.println("Nombre: " + p.getNombre()+ "\nId: " + p.getId());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
