package com.julieta.conexion;

import com.julieta.entidades.Alumno;
import com.julieta.entidades.Producto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Conexion {
    public static Session leerConexion() {
        SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Alumno.class)
                //No olvidar agregar las clases entidades que necesitamos para las consultas
                .addAnnotatedClass(Producto.class)
                .buildSessionFactory();
        return sf.getCurrentSession();
    }
}
