/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjClase;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/**
 *
 * @author eduardo
 */
public class Silla implements Comparable<Silla>{
    
    double peso;
    private String nombre;

    public Silla(double peso, String nombre) {
        this.peso = peso;
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Silla{" + "peso=" + peso + ", silla=" + nombre + '}';
    }
    //EQUALS --> HASCODE (Saber si dos objetos son iguales)
    @Override    
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Silla other = (Silla) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    //COMPARAR OBJETOS SEGUN SU ORDEN NATURAL
    @Override
    public int compareTo(Silla o) {
        return nombre.compareTo(o.getNombre());
    }
}
