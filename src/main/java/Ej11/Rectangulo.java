/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej11;

/**
 *
 * @author eduardo
 */
public class Rectangulo extends Figura {

    private int areaRectangulo;

    public Rectangulo(int base, int altura) {
        super(base, altura);
        this.areaRectangulo = areaRectangulo;
    }

    public int getAreaRectangulo() {
        return areaRectangulo;
    }

    public void setAreaRectangulo(int areaRectangulo) {
        this.areaRectangulo = areaRectangulo;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "areaRectangulo=" + areaRectangulo + '}';
    }

}
