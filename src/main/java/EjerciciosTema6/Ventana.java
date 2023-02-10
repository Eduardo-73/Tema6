/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema6;

/**
 *
 * @author eduardo
 */
public class Ventana {
    
    private int numVentanas;

    public Ventana(int numVentanas) {
        this.numVentanas = numVentanas;
    }

    public Ventana() {
    }

    public void abrirVentana(){
        System.out.println("La ventana " + this.getNumVentanas()+" esta abierta");
    }
    
    public void cerrarVentana(){
        System.out.println("La ventana " + this.getNumVentanas()+" esta cerrada");
    }
    
    public int getNumVentanas() {
        return numVentanas;
    }

    public void setNumVentanas(int numVentanas) {
        this.numVentanas = numVentanas;
    }

    @Override
    public String toString() {
        return "Ventana{" + "numVentanas=" + numVentanas + '}';
    }

}
