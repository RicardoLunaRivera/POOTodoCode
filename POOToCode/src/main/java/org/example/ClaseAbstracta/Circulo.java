package org.example.ClaseAbstracta;

import org.example.Interfaces.Dibujable;
import org.example.Interfaces.Rotable;

public class Circulo extends Figura implements Dibujable, Rotable {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double PI = 3.1416;
        double resultado=  PI * (radio* radio);
        return 0;

    }

    @Override
    public void dibujar() {
        System.out.println("Se esta dibujando un Circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Se está rotando el círculo");
    }
}
