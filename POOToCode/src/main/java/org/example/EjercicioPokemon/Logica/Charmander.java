package org.example.EjercicioPokemon.Logica;

import org.example.EjercicioPokemon.Interfaz.IFuego;

public class Charmander extends Pokemon implements IFuego {

    public Charmander(){ }

    @Override
    public  void ataquePlacaje() {
        System.out.println("Soy Charmander y estoy atacando con Placaje");
    }

    @Override
    public  void ataqueAranniazo() {
        System.out.println("Soy Charmander  y estoy atacando con Aranniazo");
    }

    @Override
    public void ataqueMordisco() {
        System.out.println("Soy Charmander y estoy atacando con Mordisco");
    }

    @Override
    public void atacarPunnioFuego() {
        System.out.println("Soy Charmander y estoy atacando con Puño Fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Soy Charmander y estoy atacando con Lanza Llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y estoy atacando con Ascuas");
    }
}
