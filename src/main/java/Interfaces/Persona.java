/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author eduardo
 */
//Una clase abstracta no esta obligada a implementar los metodos abastract 
//de las interdaces que implementa
public abstract class Persona implements Identificable {

    private String nombre;
    private String apellido;
    private String nif;
    private Direccion direccion;

    public Persona(String nombre, String apellido, String nif, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.direccion = direccion;
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

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + ", direccion=" + direccion + '}';
    }

}
