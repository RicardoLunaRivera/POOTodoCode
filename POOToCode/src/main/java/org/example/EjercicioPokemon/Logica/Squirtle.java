package org.example.EjercicioPokemon.Logica;

import org.example.EjercicioPokemon.Interfaz.IAgua;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle(){ }

    @Override
    public void ataquePlacaje() {
        System.out.println("Soy Squirtle y estoy atacando con Placaje");
    }

    @Override
    public void ataqueAranniazo() {
        System.out.println("Soy Squirtle  y estoy atacando con Aranniazo");
    }

    @Override
    public void ataqueMordisco() {
        System.out.println("Soy Squirtle y estoy atacando con Mordisco");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Soy Squirtle y estoy atacando con Hidro Bomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y estoy atacando con Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y estoy atacando con Pistola Agua");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy Squirtle y estoy atacando con Hidropulso");
    }
}
