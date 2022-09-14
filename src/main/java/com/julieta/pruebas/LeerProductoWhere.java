package com.julieta.pruebas;

import com.julieta.conexion.Conexion;
import com.julieta.entidades.Alumno;
import com.julieta.entidades.Producto;
import org.hibernate.Session;

import java.util.List;

public class LeerProductoWhere {
    public static void main(String[] args) {
        //1) Leer la conexion
        Session miSesion = Conexion.leerConexion();
        try {
            miSesion.beginTransaction();
            //SQL: SELECT * FROM alumnos WHERE id > 4
            List<Producto> listaProductos = (List<Producto>) miSesion.createQuery("from Producto p WHERE p.stock < 50").list();
            if(listaProductos.isEmpty()) {
                System.out.println("No existen productos con el criterio indicado");
            }else{
                System.out.println("Productos con stock menor a 50:\n");
                for(Producto p : listaProductos){

                    System.out.println("Nombre: " + p.getNombre()+ "\nStock: " + p.getStock());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
