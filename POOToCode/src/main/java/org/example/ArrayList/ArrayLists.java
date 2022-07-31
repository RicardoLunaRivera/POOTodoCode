package org.example.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(1,"Ricardo",30));
        lista.add(new Persona(2,"Fulanito",40));
        lista.add(new Persona(3,"Menganito",50));
        lista.add(new Persona(4,"Sutanito",50));

        //Recorrer por índice
        System.out.println("==================RECORRIDO POR FOR");

        for (int i=0;  i<lista.size();i++){
            System.out.println("Persona: " + lista.get(i).getNombre());
        }

        System.out.println("=================RECORRIDO POR FOREACH");
        //Recorrido foreach
        for (Persona persona:lista){
            System.out.println("Persona: "+persona.getNombre());
        }

    }
}

