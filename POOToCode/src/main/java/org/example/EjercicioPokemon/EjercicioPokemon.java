package org.example.EjercicioPokemon;

import org.example.EjercicioPokemon.Logica.Bolbasaur;
import org.example.EjercicioPokemon.Logica.Charmander;
import org.example.EjercicioPokemon.Logica.Pikachu;
import org.example.EjercicioPokemon.Logica.Squirtle;

public class EjercicioPokemon {
    public static void main(String[] args) {

        Squirtle squirtle1 = new Squirtle();
        Charmander charmander1 = new Charmander();
        Pikachu pikachu1 = new Pikachu();
        Bolbasaur bolbasaur1 = new Bolbasaur();

        System.out.println("=====SQUIRTLE=====");
        squirtle1.ataqueAranniazo();
        squirtle1.atacarBurbuja();
        System.out.println("=====CHARMANDER=====");
        charmander1.ataqueAranniazo();
        charmander1.atacarLanzaLlamas();
        System.out.println("=====PIKACHU=====");
        pikachu1.ataqueAranniazo();
        pikachu1.atacarImpactrueno();
        System.out.println("=====BULBASAUR=====");
        bolbasaur1.ataqueAranniazo();
        bolbasaur1.atacarHojaAfilada();

    }
}
