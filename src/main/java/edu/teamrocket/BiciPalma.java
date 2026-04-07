package edu.teamrocket.domain.estacion;

import edu.teamrocket.domain.bicicleta.Bicicleta;
import edu.teamrocket.domain.tarjetausuario.TarjetaUsuario;
import edu.teamrocket.domain.estacion.Estacion;

public class BiciPalma {

    public static void main(String[] args) {

        // Crear estación con 6 anclajes
        Estacion estacion = new Estacion(1, "Calle Mayor 123", 6);

        // Crear bicicletas
        Bicicleta bici1 = new Bicicleta(101);
        Bicicleta bici2 = new Bicicleta(102);

        // Crear tarjeta de usuario
        TarjetaUsuario tarjeta = new TarjetaUsuario("ABC123", true);

        // Consultar estación
        estacion.consultarEstacion();

        // Anclar bicicletas
        estacion.anclarBicicleta(bici1);
        estacion.anclarBicicleta(bici2);

        // Consultar anclajes
        estacion.consultarAnclajes();

        // Leer tarjeta
        estacion.leerTarjetaUsuario(tarjeta);

        // Retirar bicicleta
        System.out.println("Retirando bicicleta...");
        estacion.retirarBicicleta(tarjeta);

        // Consultar anclajes después de retirar
        estacion.consultarAnclajes();
    }
}

}