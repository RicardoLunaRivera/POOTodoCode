package org.example.EjercicioPokemon.Logica;

import org.example.EjercicioPokemon.Interfaz.IPlanta;

public class Bolbasaur extends Pokemon implements IPlanta {

    public Bolbasaur(){ }

    @Override
    public void ataquePlacaje() {
        System.out.println("Soy Bolbasaur y estoy atacando con Placaje");
    }

    @Override
    public void ataqueAranniazo() {
        System.out.println("Soy Bolbasaur y estoy atacando con Aranniazo");
    }

    @Override
    public void ataqueMordisco() {
        System.out.println("Soy Bolbasaur y estoy atacando con Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bolbasaur y estoy atacando con Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy Bolbasaur y estoy atacando con Paralizar");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy Bolbasaur y estoy atacando con Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy Bolbasaur y estoy atacando con Latigo Cepa");
    }
}
