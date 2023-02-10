/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author eduardo
 */
public class VehiculoElectrico extends Vehiculo {

    private int numeroBaterias;
    private int duracionCarga;//minutos

    
    
    
    public VehiculoElectrico(){
        
    }
    
    public void cargarBateria(){
        System.out.println("El vehículo "+ this.getMatricula() + " esta cargando ...");
    }
    
    public void cambiarBateria(){
        System.out.println("El vehículo "+ this.getMatricula() + " ha sustituido sus baterias ...");
    }
    
    public void arrancar(){
        System.out.println("Soy un vehículo electrico "+ this.getMarca() + 
                " y estoy arrancando");
    }
    
    
}
