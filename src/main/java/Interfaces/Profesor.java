/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author eduardo
 */
public abstract class Profesor extends Persona {

    private String especialidad;

    public Profesor(String especialidad, String nombre, String apellido, String nif, Direccion direccion) {
        super(nombre, apellido, nif, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" + "especialidad=" + especialidad + '}';
    }

    //El método final implica que no se puede sobreescribir en subclases
    @Override
    public void identificate() {
        System.out.println("Soy un profesor");
    }
}
