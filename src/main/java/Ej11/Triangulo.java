/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej11;

/**
 *
 * @author eduardo
 */
public class Triangulo extends Figura {

    private int triangulo;

    public Triangulo(int base, int altura) {
        super(base, altura);
        this.triangulo = triangulo;
    }

    public int getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(int triangulo) {
        this.triangulo = triangulo;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "triangulo=" + triangulo + '}';
    }

}
