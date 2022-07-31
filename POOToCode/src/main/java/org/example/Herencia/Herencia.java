package org.example.Herencia;

public class Herencia {
    public static void main(String[] args) {
        //Empleado extiende "Domicilio" de persona y de su propia clase
        Empleado empleado1 = new Empleado();
        empleado1.getIdEmpleado();
        empleado1.getDomicilio();

        //Empleado extiende "Domicilio" de persona y de su propia clase
        Consultor consultor1 = new Consultor();
        consultor1.getNombreConsultoria();
        consultor1.getDomicilio();


        //EJEMPLO POLIMORFISMO

        Persona vector [] = new Persona[5];
        vector [0] = new Persona();
        vector [1] = new Empleado();
        vector [2] = new Consultor();
        vector [3] = new Consultor();

        Persona persona1 = new Persona();
        Consultor consultor = new Consultor();

        //Polimorfismo de padre a hijo
        persona1 = consultor1;

        //no se puede hacer de hijo a padre
        //consultor1= persona1;


    }
}
