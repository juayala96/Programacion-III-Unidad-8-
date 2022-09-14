package com.julieta.pruebas;

import com.julieta.conexion.Conexion;
import com.julieta.entidades.Producto;
import org.hibernate.Session;

import java.util.List;

public class ListaProductosOrdenados {
    public static void main(String[] args) {
        Session miSesion = Conexion.leerConexion();
        try {
            miSesion.beginTransaction();
            List<Producto> listaProductos = miSesion.createQuery("from Producto p order by p.stock desc").list();
            System.out.println("Productos:\n");
            for(Producto p : listaProductos){
                System.out.println(p.getNombre() + " Stock: " + p.getStock());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
