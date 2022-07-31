package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Ejemplo con constructor vacio
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Fulanito");
        alumno1.setApellido("De Tal");
        alumno1.setId(5);

        System.out.println("============================");
        System.out.println("el ID del primer alumno es: "+alumno1.getId());
        System.out.println("El nombre del alumno es: "+alumno1.getNombre() +" " +alumno1.getApellido());

        //Ejemplo de constructor con parametros
        Alumno alumno2 = new Alumno(45,"Ricardo","Luna");
        alumno1.mostrarNombreCompleto();
        alumno2.mostrarNombreCompleto();

        System.out.println("============================");
        System.out.println("el ID del segundo alumno es: "+alumno2.getId());
        System.out.println("El nombre del alumno  es: "+alumno2.getNombre() +" " +alumno2.getApellido());


        System.out.println("============================");
        //modificar valor ya asignado
        alumno1.setId(100);
        alumno2.setId(50);

        System.out.println("el ID del primer alumno es: "+alumno1.getId());
        System.out.println("el ID del segundo alumno es: "+alumno2.getId());


    }

}