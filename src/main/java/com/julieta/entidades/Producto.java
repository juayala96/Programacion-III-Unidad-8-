package com.julieta.entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="productos")
public class Producto {
    @Id //anotacion clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //anotacion campo autoincremental
    @Column(name = "idproductos")//indica columna en la tabla se llama de otra forma
    private int id;
    private String nombre;
    private String descripcion;
    private int stock;
    private Date fecha_ultima_venta;


    public Producto() {
    }

    public Producto(String nombre, String descripcion, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
    }

    public Producto(String nombre, String descripcion, int stock, Date fecha_ultima_venta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.fecha_ultima_venta = fecha_ultima_venta;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getFecha_ultima_venta() {
        return fecha_ultima_venta;
    }

    public void setFecha_ultima_venta(Date fecha_ultima_venta) {
        this.fecha_ultima_venta = fecha_ultima_venta;
    }
}
