/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema6;

/**
 *
 * @author eduardo
 */
public class Calefactor {

    private int temperatura;
    private String valor = "ºC";

    public Calefactor(int temperatura, String valor) {
        this.temperatura = temperatura;
        this.valor = valor;
    }

    public Calefactor() {
    }
    
    public void encendar(){
        System.out.println("El calefactor " + this.getTemperatura() + " esta encendido");
    }
    
    public void apagar(){
        System.out.println("El calefactor " + this.getTemperatura() + " esta apagado");
    }

    public void fijarTemperatura(){
        System.out.println("El calefactor esta ha " + this.getTemperatura());
    }
    
    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Calefactor{" + "temperatura=" + temperatura + ", valor=" + valor + '}';
    }

}
