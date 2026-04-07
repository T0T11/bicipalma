package edu.teamrocket.domain.estacion;

import edu.teamrocket.domain.tarjetausuario.TarjetaUsuario;
import edu.teamrocket.domain.bicicleta.Movil;


import java.util.Arrays;

public class Anclajes {

    private Anclaje[] anclajes; /* hago un array llamado anclajes lleno de objetos llamado Anclaje*/

    public Anclajes(int numAnclajes){
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    public void crearAnclajes(){
        for (int I = 0; I < anclajes.length; I++)
            anclajes[I] = new Anclaje();  /* en cada posicion de los anclajes, creo un nuevo anclajes solo cuando la
            hay posiciones libres*/
    }
    public int numAclanjes(){
        return anclajes.length;
    }

    public void ocuparAnclaje(int posicion, Movil bici){
        anclajes[posicion].anclarBici(bici); /*en el array,usando la posicion, le aplico la funcion anclarbici usando
        la bici en cuestion*/
    }
    public boolean isAnclajeOcupado(int posicion){
       return anclajes[posicion].isOcupado();
    }
    public Movil getBiciAt(int posicion){
         return anclajes[posicion].getBici();
    }

    public int seleccionarAnclaje(){
        for (int i = 0; i < anclajes.length; i++) {
            if (!anclajes[i].isOcupado()) { /*el ! = si no, es para que te de lo contrario sabiendo que si o si te tiene
            que devolver un booleano*/
                return i;

            }

        } return -1;
    }

    @Override
    public String toString() {
        return "Anclajes{" +
                "anclajes=" + Arrays.toString(anclajes) +
                '}';
    }
}

