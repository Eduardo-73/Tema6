/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VentanaAbstracta;

/**
 *
 * @author eduardo
 */
public class VAbatible extends Ventana {

    //Todas las clases hijas deben de implementar los métodos abstractos
    private int gradosApertura;

    public VAbatible(int gradosApertura, boolean estado) {
        super(estado);
        this.gradosApertura = gradosApertura;
    }

   
    
    public int getGradosApertura() {
        return gradosApertura;
    }

    public void setGradosApertura(int gradosApertura) {
        this.gradosApertura = gradosApertura;
    }

    @Override
    public String toString() {
        return "VAbatible{" + "gradosApertura=" + gradosApertura + '}';
    }

    @Override
    public void cerra(int numero) {
        //Hay que indicar que esta abierta y además los grados de apertura se 
        //se calculan dividiendo entre 2
        this.setEstado(true);
        this.gradosApertura = numero;
    }

    @Override
    public void abrir(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
