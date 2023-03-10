/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej14;

/**
 *
 * @author eduardo
 */
public class CampanaExtratora extends Electrodomesticos {

    private int decibelios;
    private final int maxDecibelio = 50;

    public CampanaExtratora(int decibelios, double consumo, String modelo) {
        super(consumo, modelo);
        if (decibelios < maxDecibelio) {
            this.decibelios = decibelios;
        }
    }

    public int getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(int decibelios) {
        this.decibelios = decibelios;
    }

    @Override
    public String toString() {
        return "CampanaExtratora{" + "decibelios=" + decibelios + ", maxDecibelio=" + maxDecibelio + '}';
    }

}
