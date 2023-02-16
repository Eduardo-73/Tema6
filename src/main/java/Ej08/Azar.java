/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej08;

/**
 *
 * @author eduardo
 */
public abstract class Azar {

    protected int posibilidades;

    public abstract int lanzar();

    public Azar(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    public int getPosibilidades() {
        return posibilidades;
    }

    public void setPosibilidades(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    @Override
    public String toString() {
        return "Azar{" + "posibilidades=" + posibilidades + '}';
    }

}
