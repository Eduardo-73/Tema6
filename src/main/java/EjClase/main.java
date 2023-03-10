/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjClase;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author eduardo
 */
public class main {

    public static void main(String[] args) {

        Map<Silla, Integer> map = new HashMap<>();

        map.put(new Silla(32, "Silla1"), 32);
        map.put(new Silla(23, "Silla1"), 23);
        map.put(new Silla(34, "Silla1"), 34);
        map.put(new Silla(33, "Silla1"), 33);
        
        map.put(new Silla(34, "Silla1"), 34);
        map.put(new Silla(35, "ZSilla"), 35);
        map.put(new Silla(36, "ASilla1"), 36);
        map.put(new Silla(37, "GSilla1"), 37);
    }

}
