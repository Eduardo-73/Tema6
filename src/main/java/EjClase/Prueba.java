/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjClase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author eduardo
 */
public class Prueba {

    public static void main(String[] args) {

        Map<Silla, Integer> map = new HashMap<>();

        Silla s1 = new Silla(34, "Silla1");
        Silla s2 = new Silla(35, "ZSilla");
        Silla s3 = new Silla(36, "ASilla1");
        Silla s4 = new Silla(37, "GSilla1");

        map.put(s1, 34);
        map.put(s3, 36);
        map.put(s2, 35);

        for (Map.Entry<Silla, Integer> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();

            System.out.println("Key: " + key + "\t Value: " + val);

        }

        List<Silla> listaSilla = new ArrayList<>();
        listaSilla.add(s1);
        listaSilla.add(s2);
        listaSilla.add(s3);
        listaSilla.add(s4);

        System.out.println("Lista de sillas según el orden de insección: ");
        listaSilla.forEach(s -> System.out.println("Nombre: " + s.getNombre()));

        System.out.println("Lista de sillas según el orden natural: ");
        Collections.sort(listaSilla);
        listaSilla.forEach(s -> System.out.println("Nombre: " + s.getNombre()));
        //la varaible criterio es de tioi CriterioPeso, Object, Comparator
        System.out.println("Lista de sillas según su peso: ");
        CriterioPeso criterio = new CriterioPeso();
        Collections.sort(listaSilla, new Comparator<Silla>() {
            @Override
            public int compare(Silla o1, Silla o2) {
                return Double.compare(o1.peso, o2.peso);
            }

        });
        Collections.sort(listaSilla, (si1,si2)->Double.compare(si1.peso, si2.peso));
        listaSilla.forEach(System.out::println);
    }
}
