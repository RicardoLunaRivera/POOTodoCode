package org.example.LinkedList;

import org.example.ArrayList.Persona;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        List<Persona> lista = new LinkedList<Persona>();

        lista.add(new Persona(1,"Ricardo",30));
        lista.add(new Persona(2,"Fulanito",40));
        lista.add(new Persona(3,"Menganito",50));
        lista.add(new Persona(4,"Sutanito",50));

        //Agregar al principio
        lista.add(0, new Persona(5,"Merenganito",10));
        lista.add(0, new Persona(5,"Fuckencia",20));

        System.out.println("=================RECORRIDO POR FOREACH");
        //Recorrido foreach
        for (Persona persona:lista){
            System.out.println("Persona: "+persona.getNombre());
        }
    }
}
