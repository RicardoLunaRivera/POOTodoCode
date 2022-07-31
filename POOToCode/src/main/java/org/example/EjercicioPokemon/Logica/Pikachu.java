package org.example.EjercicioPokemon.Logica;

import org.example.EjercicioPokemon.Interfaz.IElectrico;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu(){ }

    @Override
    public void ataquePlacaje() {
        System.out.println("Soy Pikachu y estoy atacando con Placaje");
    }

    @Override
    public void ataqueAranniazo() {
        System.out.println("Soy Pikachu y estoy atacando con Aranniazo");
    }

    @Override
    public void ataqueMordisco() {
        System.out.println("Soy Pikachu y estoy atacando con Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy Pikachu y estoy atacando con Impactrueno");
    }

    @Override
    public void atacarPunnioTrueno() {
        System.out.println("Soy Pikachu y estoy atacando con Puño Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy Pikachu y estoy atacando con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy Pikachu y estoy atacando con Rayo Carga");
    }
}
