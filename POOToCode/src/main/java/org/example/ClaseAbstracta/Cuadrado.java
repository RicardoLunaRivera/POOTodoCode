package org.example.ClaseAbstracta;

import org.example.Interfaces.Area;
import org.example.Interfaces.Dibujable;

public class Cuadrado extends Figura implements Area, Dibujable {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }



    @Override
    public void dibujar() {
        System.out.println("Se esta dibujando un cuadrado");
    }

    @Override
    public double calcularAreas() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public double calcularArea() {
        return 0;
    }
}
