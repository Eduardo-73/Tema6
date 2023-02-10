/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema6;

/**
 *
 * @author eduardo
 */
public class Persiana {

    private int persiana;

    public Persiana() {
    }

    public Persiana(int persiana) {
        this.persiana = persiana;
    }
    
    public void subir(){
        System.out.println("La persiana " + this.getPersiana() + " esta subida");
    }
    
    public void bajar(){
        System.out.println("La persiana " + this.getPersiana() + " esta bajada");
    }

    public int getPersiana() {
        return persiana;
    }

    public void setPersiana(int persiana) {
        this.persiana = persiana;
    }

    @Override
    public String toString() {
        return "Persiana{" + "persiana=" + persiana + '}';
    }

}
