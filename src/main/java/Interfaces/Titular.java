/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.time.LocalDate;

/**
 *
 * @author eduardo
 */
public final class Titular extends Profesor{
    
    private LocalDate juvilacion;
    
    public Titular(LocalDate juvilacion, String especialidad, String nombre, String apellido, String nif, Direccion direccion) {
        super(especialidad, nombre, apellido, nif, direccion);
        this.juvilacion = juvilacion;
    }

    public LocalDate getJuvilacion() {
        return juvilacion;
    }

    public void setJuvilacion(LocalDate juvilacion) {
        this.juvilacion = juvilacion;
    }

    @Override
    public String toString() {
        return "Titular{" + "juvilacion=" + juvilacion + '}';
    }
}
