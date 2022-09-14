package com.julieta.pruebas;

import com.julieta.conexion.Conexion;
import com.julieta.entidades.Producto;
import org.hibernate.Session;

import java.util.List;

public class ListaProductos {
    public static void main(String[] args) {
        Session miSesion = Conexion.leerConexion();
        try {

            miSesion.beginTransaction();
            //SQL: SELECT * FROM productos AS p;
            //HQL: from Producto p
            List<Producto> listaProductos = miSesion.createQuery("from Producto p").list();
            System.out.println("Productos:\n");
            for(Producto p : listaProductos){
                System.out.println(p.getNombre());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
