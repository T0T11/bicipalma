
package edu.teamrocket.domain.estacion;

import edu.teamrocket.domain.bicicleta.Movil;
import edu.teamrocket.domain.tarjetausuario.Autenticacion;
import edu.teamrocket.domain.estacion.Anclajes;
import edu.teamrocket.domain.tarjetausuario.TarjetaUsuario;

public class Estacion {

    private int id;
    private String direccion;
    private Anclajes anclajes; /*anclajes esta hecho a parte del array anclajes*/

    public Estacion( int id, String direccion ,int numAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numAnclajes);
    }

    public void consultarEstacion(){
        System.out.println(" id: " + id );
        System.out.println(" direccion: " + direccion );
        System.out.println(" anclajes :" + anclajes.numAclanjes());
    }

    public int anclarLibres() {
        int libres = 0;
        for (int i = 0; i < anclajes.numAclanjes(); i++) {
            if (!anclajes.isAnclajeOcupado(i)){ libres++; }
        }
        return libres;
    }

    public void anclajesBici(Movil bici) {
        int ocupar = anclajes.seleccionarAnclaje();
        if (ocupar != -1)
        { anclajes.ocuparAnclaje(ocupar, bici); }
    }

    public boolean leerTarjeta(Autenticacion tarjeta){
        return tarjeta.isActivada();
    }

    public void retirarBicicleta(Autenticacion tarjeta){
       if (!tarjeta.isActivada()){
           System.out.println("tarjeta no activa");
       }


     for (int i = 0; i < anclajes.numAclanjes(); i++) {

        if (anclajes.isAnclajeOcupado(i))
        {
        Movil bici = anclajes.getBiciAt(i);
        anclajes.liberarAnclaje(i);
        }
     }
    }

public void mostrarBici(Movil bici, int posicion){
        System.out.println("bici :" + bici.toString());
}

public void  mostrarAnclaje(Movil bici, int numAnclaje){
        System.out.println("anclaje :" + numAnclaje );
        System.out.println("bici:" + bici.getId());
}


public void consultarAnclaje(){

}

}
