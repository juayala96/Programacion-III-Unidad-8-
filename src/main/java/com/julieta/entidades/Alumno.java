package com.julieta.entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="alumnos")
public class Alumno {
    @Id //anotacion clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //anotacion campo autoincremental
    @Column(name = "idalumnos")//indica columna en la tabla se llama de otra forma
    private int id;
    private String nombre;
    private String apellido;
    private Date fecha_ingreso;


    public Alumno() {
    }
    //Constrcturo con todos los atributos menos el id (PK)
    public Alumno(String nombre, String apellido, Date fecha_ingreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
}
