/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema6;

/**
 *
 * @author eduardo
 */
public class Puerta {

    private int numPuerta;

    public Puerta(int numPuerta) {
        this.numPuerta = numPuerta;
    }

    public void cerrarPuerta() {
        System.out.println("La puerta " + this.getNumPuerta() + " esta cerrada");
    }

    public void abrirPuerta() {
        System.out.println("La puerta " + this.getNumPuerta() + " esta abierta");
    }

    public Puerta() {
    }

    public int getNumPuerta() {
        return numPuerta;
    }

    public void setNumPuerta(int numPuerta) {
        this.numPuerta = numPuerta;
    }

    @Override
    public String toString() {
        return "Puerta{" + "numPuerta=" + numPuerta + '}';
    }
}
