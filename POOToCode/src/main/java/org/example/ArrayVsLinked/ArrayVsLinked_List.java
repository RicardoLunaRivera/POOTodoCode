package org.example.ArrayVsLinked;

import org.example.ArrayList.Persona;

import java.util.LinkedList;
import java.util.List;

public class ArrayVsLinked_List {
    public static void main(String[] args) {
        List<org.example.ArrayList.Persona> arraylist = new LinkedList<org.example.ArrayList.Persona>();

        arraylist.add(new Persona(1,"Ricardo",30));
        arraylist.add(new Persona(2,"Fulanito",40));
        arraylist.add(new Persona(3,"Menganito",50));
        arraylist.add(new Persona(4,"Sutanito",50));

        List<Persona> linkedlist = new LinkedList<Persona>();

        linkedlist.add(new Persona(1,"Roberto",30));
        linkedlist.add(new Persona(2,"Fernando",40));
        linkedlist.add(new Persona(3,"Alejandro",50));
        linkedlist.add(new Persona(4,"Stephanie",50));

        System.out.println("********************ARRAYLIST********************");
        System.out.println("=========================Antes");
        for(Persona persona: arraylist){
            System.out.println("Idice: " + persona.getNum()+" " +"Nombre: "+ persona.getNombre());
        }

        System.out.println("=========================Remove");
        //REMOVE en Array List
        arraylist.remove(3);

        System.out.println("=========================Después");
        for(Persona persona: arraylist){
            System.out.println("Idice: "+ persona.getNum()+ " " +"Nombre: "+ persona.getNombre());
        }

        System.out.println("\n\n*******************LINKEDLIST********************");
        System.out.println("=========================Antes");
        for (Persona persona:linkedlist){
            System.out.println("Índice: "+ persona.getNum()+ " " +"Nombre: "+persona.getNombre());
        }

        System.out.println("=========================Remove");
        String nombreBorrar="Alejandro";
        for (Persona persona : linkedlist){
            if (persona.getNombre().endsWith(nombreBorrar)){
                linkedlist.remove(persona);
                break;
            }
        }
        System.out.println("=========================Después");
        for (Persona persona:linkedlist){
            System.out.println("Índice: "+ persona.getNum()+ " " +"Nombre: "+persona.getNombre());
        }
    }
}
