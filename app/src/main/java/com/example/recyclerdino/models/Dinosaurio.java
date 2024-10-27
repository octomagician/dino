package com.example.recyclerdino.models;
import java.io.Serializable;

public class Dinosaurio implements Serializable{ //hay que agregar que la clase se puede serializar
    private String nombre;
    private String tipo;
    private String descripcion;
    private String color;
    private int imagen;

    //constructor del dino para sacarlo directo del mainactivity
    public Dinosaurio(String nombre, String tipo, String descripcion, String color, int imagen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.color = color;
        this.imagen = imagen;
    }

    //get set para hacerlos propiedades
    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public String getDescripcion() {

        return descripcion;
    }

    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public int getImagen() {

        return imagen;
    }

    public void setImagen(int imagen) {

        this.imagen = imagen;
    }



}
