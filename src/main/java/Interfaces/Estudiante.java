/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import Ej03.Persona;

/**
 *
 * @author eduardo
 */
public class Estudiante extends Persona {
    
    private String id;

    public Estudiante(String id, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + '}';
    }
    
    
    
}
