package org.example;

public class Alumno {
    int id;
    String nombre = "Roberto";
    String apellido;

    //Constructor VACIO
    public Alumno() {
    }
    //CONSTRUCTOR CON TODOS LOS ATRIBUTOS
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrarNombreCompleto(){
        System.out.println("Hola, mi nombre es: " + this.nombre);

    }
}
