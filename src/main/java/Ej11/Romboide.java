/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej11;

/**
 *
 * @author eduardo
 */
public class Romboide extends Figura{
    
    private int areaRomboide;

    public Romboide(int base, int altura) {
        super(base, altura);
        this.areaRomboide = areaRomboide;
    }

    public int getAreaRomboide() {
        return areaRomboide;
    }

    public void setAreaRomboide(int areaRomboide) {
        this.areaRomboide = areaRomboide;
    }

    @Override
    public String toString() {
        return "Romboide{" + "areaRomboide=" + areaRomboide + '}';
    }
}
