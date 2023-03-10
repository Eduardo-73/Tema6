/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class main {
    
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        
.        lista.add(new Estudiante("1", "Pepillo", "456456456", 25));
        lista.add(new Titular(LocalDate.now(), "Maestro repostero", "Jaimito", "45645646", 23));
        
    }
}
