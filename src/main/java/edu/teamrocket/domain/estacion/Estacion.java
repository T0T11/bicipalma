
package edu.teamrocket.domain.estacion;

import edu.teamrocket.domain.bicicleta.Movil;
import edu.teamrocket.domain.tarjetausuario.Autenticacion;

public class Estacion {

    private int id;
    private String direccion;
    private Anclajes anclajes;

    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numAnclajes);
    }

    public void consultarEstacion() {
        System.out.println("Id: " + id);
        System.out.println("Direccion: " + direccion);
        System.out.println("Numero de anclajes: " + anclajes.numAclanjes());
    }

    public int anclajesLibres() {
        int libres = 0;
        for (int i = 0; i < anclajes.numAclanjes(); i++) {
            if (!anclajes.isAnclajeOcupado(i)) {
                libres++;
            }
        }
        return libres;
    }

    public void anclarBicicleta(Movil bici) {
        int pos = anclajes.seleccionarAnclaje();
        if (pos != -1) {
            anclajes.ocuparAnclaje(pos, bici);
            mostrarAnclaje(bici, pos);
        }
    }

    public void leerTarjetaUsuario(Autenticacion tarjeta) {
        System.out.println("Tarjeta de usuario: " + tarjeta.getClass());
        System.out.println("Activada: " + tarjeta.isActivada());
    }

    public Movil retirarBicicleta(Autenticacion tarjeta) {
        if (!tarjeta.isActivada()) {
            System.out.println("Tarjeta inactiva");
            return null;
        }

        for (int i = 0; i < anclajes.numAclanjes(); i++) {
            if (anclajes.isAnclajeOcupado(i)) {
                Movil bici = anclajes.getBiciAt(i);
                anclajes.ocuparAnclaje(i);
                return bici;
            }
        }
        return null;
    }

    public void mostrarAnclaje(Movil bici, int numeroAnclaje) {
        System.out.println("Bicicleta " + bici.getId() + " anclada en el anclaje " + numeroAnclaje);
    }

    public void mostrarBicicleta(Movil bici) {
        System.out.println("Bicicleta: " + bici.toString());
    }

    public void consultarAnclajes() {
        for (int i = 0; i < anclajes.numAclanjes(); i++) {
            System.out.println("Anclaje " + i + ": " +
                    (anclajes.isAnclajeOcupado(i) ? "Ocupado" : "Libre"));
        }
    }

    public void mostrarAnclaje(Movil bici, int numeroAnclaje) {
        System.out.println("Bicicleta " + bici.getId() + " anclada en el anclaje " + numeroAnclaje);
    }

    public void mostrarBicicleta(Movil bici) {
        System.out.println("Bicicleta: " + bici.toString());
    }

    public void consultarAnclajes() {
        for (int i = 0; i < anclajes.numAclanjes(); i++) {
            System.out.println("Anclaje " + i + ": " +
                    (anclajes.isAnclajeOcupado(i) ? "Ocupado" : "Libre"));
        }
    }
}
}
