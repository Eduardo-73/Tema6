/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej14;

/**
 *
 * @author eduardo
 */
public class Microondas extends Electrodomesticos implements Silencioso {

    private int potenciaMaxV;

    public Microondas(int potenciaMaxV, double consumo, String modelo) {
        super(consumo, modelo);
        this.potenciaMaxV = potenciaMaxV;
    }

    public int getPotenciaMaxV() {
        return potenciaMaxV;
    }

    public void setPotenciaMaxV(int potenciaMaxV) {
        this.potenciaMaxV = potenciaMaxV;
    }

    @Override
    public String toString() {
        return "Microondas{" + "potenciaMaxV=" + potenciaMaxV + '}';
    }

    @Override
    public void silencioso() {
        System.out.println("El microondas emite un consumo de " + this.getConsumo());
    }

}
