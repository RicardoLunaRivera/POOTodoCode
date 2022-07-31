package org.example.Herencia;

public class Empleado extends Persona{
    int idEmpleado;
    String cargo;
    int sueldo;

    public Empleado() {}

    public Empleado(int id, String nombre, String apellido, String domicilio, int numero, int idEmpleado, String cargo, int sueldo) {
        super(id, nombre, apellido, domicilio, numero);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
