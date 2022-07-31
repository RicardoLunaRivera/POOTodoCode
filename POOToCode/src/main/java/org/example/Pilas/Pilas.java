package org.example.Pilas;

import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println("Pila Vacía: " + stack);
        System.out.println("Esta vacia? " + stack.isEmpty());

        //AGREGAR
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);

        //RECORRIDO
        for(Integer itemsStack : stack ){
            System.out.println(itemsStack);
        }

        //MOSTRAR
        System.out.println("Pila: " + stack);
        System.out.println("Pila Vacia? " +stack.isEmpty());

        //ELIMINAR EL ÚLTIMO ELEMENTO
        stack.pop();

        //BUSCAR UN ELEMENTO
        System.out.println("Hay un 13? "+ stack.search(12));
        System.out.println("Último agregado: " +stack.peek());

    }
}
