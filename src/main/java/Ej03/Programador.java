/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej03;

/**
 *
 * @author eduardo
 */
public class Programador extends Empleados {

    private Categoria categoria;

    public Programador(Categoria categoria) {
        this.categoria = categoria;
    }

    public Programador() {
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Programador{" + "categoria=" + categoria + '}' + "Salario{" + "salario=" + this.getSalario() + '}';
    }

}
