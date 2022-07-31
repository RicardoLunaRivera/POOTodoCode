package org.example.Herencia;

public class Consultor extends Persona{
    String nombreConsultoria;
    int numConsultor;

    public Consultor() {}

    public Consultor(int id, String nombre, String apellido, String domicilio, int numero, String nombreConsultoria, int numConsultor) {
        super(id, nombre, apellido, domicilio, numero);
        this.nombreConsultoria = nombreConsultoria;
        this.numConsultor = numConsultor;
    }

    public String getNombreConsultoria() {
        return nombreConsultoria;
    }

    public void setNombreConsultoria(String nombreConsultoria) {
        this.nombreConsultoria = nombreConsultoria;
    }

    public int getNumConsultor() {
        return numConsultor;
    }

    public void setNumConsultor(int numConsultor) {
        this.numConsultor = numConsultor;
    }
}
