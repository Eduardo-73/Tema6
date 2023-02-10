/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author eduardo
 */
public class VehiculoCombustion extends Vehiculo{
    
    private int capacidad;//litros
    private TipoCombustible tipo;

    
    public VehiculoCombustion() {
    }

    public void main repostar(){
            System.out.println("El vehículo " +this.getMatricula() + " ha repostado");
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public TipoCombustible getTipo() {
        return tipo;
    }

    public void setTipo(TipoCombustible tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "VehiculoCombustion{" + "capacidad=" + capacidad + ", tipo=" + tipo + '}';
    }
 
}
