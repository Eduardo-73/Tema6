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
public final class Interino extends Profesor implements Comparable {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Interino(LocalDate fechaInicio, LocalDate fechaFin, String especialidad, String nombre, String apellido, String nif, Direccion direccion) {
        super(especialidad, nombre, apellido, nif, direccion);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nInterino{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }

    //@Override
    public int CompareTo(Interino o){
        return this.fechaInicio.compareTo(o.fechaInicio);
    }
    
    //No se puede sobre escribir por que es final en la clase padre
    //public void Identificate(){
    //    System.out.println("Hola ");
    //}
    
}
