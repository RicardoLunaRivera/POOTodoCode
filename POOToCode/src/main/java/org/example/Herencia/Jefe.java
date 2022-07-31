package org.example.Herencia;

public class Jefe extends Persona{
    int idJefe;
    String departamentoJefe;

    public Jefe() {}

    public Jefe(int id, String nombre, String apellido, String domicilio, int numero, int idJefe, String departamentoJefe) {
        super(id, nombre, apellido, domicilio, numero);
        this.idJefe = idJefe;
        this.departamentoJefe = departamentoJefe;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public String getDepartamentoJefe() {
        return departamentoJefe;
    }

    public void setDepartamentoJefe(String departamentoJefe) {
        this.departamentoJefe = departamentoJefe;
    }
}
