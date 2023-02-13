/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej03;

/**
 *
 * @author eduardo
 */
public class Empleados extends Persona {

    private double salario;

    public Empleados(double salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public Empleados() {
    }

    public void aumemtarSalario(double aumento){
        this.salario += aumento;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return this.getNombre() + " Nombre" + this.getNif() + "NIF" + this.getEdad() + "Edad" + this.salario + "Salario";
    }

}
