/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej08;

import java.util.Random;

/**
 *
 * @author eduardo
 */
public class Dado extends Azar {

    public Dado() {
        super(6);
    }

    public Dado(int posibilidades) {
        super(posibilidades);
    }

    public void metodoDado() {//Ejemplo para ver si salen los metodos con la clase dado
        System.out.println("Dado");
    }

    @Override
    public int lanzar() {
        return new Random().nextInt(1, this.getPosibilidades() + 1);
    }

}
