/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej14;

/**
 *
 * @author eduardo
 */
public class Frigorifico extends Electrodomesticos implements Silencioso {

    private double capacidadL;

    public Frigorifico(double capacidadL, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidadL = capacidadL;
    }

    public double getCapacidadL() {
        return capacidadL;
    }

    public void setCapacidadL(double capacidadL) {
        this.capacidadL = capacidadL;
    }

    @Override
    public String toString() {
        return "Frigorifico{" + "capacidad=" + capacidadL + '}';
    }

    @Override
    public void silencioso() {
        System.out.println("El frigorifico " + this.getModelo() + " emite 50dB");
    }

}
