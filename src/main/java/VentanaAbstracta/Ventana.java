/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VentanaAbstracta;

/**
 *
 * @author eduardo
 */
public abstract class Ventana {
    private boolean estado;

    public Ventana(boolean estado) {
        this.estado = estado;
    }

    public abstract void abrir(int numero);
  
    
    public abstract void cerra(int numero);
   
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ventana{" + "estado=" + estado + '}';
    }

}
