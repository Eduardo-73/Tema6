/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjClase;

import java.util.Comparator;

/**
 *
 * @author eduardo
 */
public class CriterioPeso implements Comparator<Silla>{

    @Override
    public int compare(Silla o1, Silla o2) {
        return Double.compare(o1.peso, o1.peso);
    }
    
}
