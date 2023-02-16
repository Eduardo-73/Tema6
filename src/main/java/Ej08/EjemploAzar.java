/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej08;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class EjemploAzar {

    public static void main(String[] args) {

        List<Azar> objetosAzar = new ArrayList<>();

        objetosAzar.add(new Moneda()); // Conversión implícita
        objetosAzar.add(new Dado()); //Conversión implícita

        for (Azar a : objetosAzar) {
            System.out.println("Lanzamientos " + a.lanzar());
            //Variable a ¿Eres un dado?
            if (a instanceof Dado) {
                ((Dado) a).metodoDado(); //Conversión explícita
            }
        }
    }
}
