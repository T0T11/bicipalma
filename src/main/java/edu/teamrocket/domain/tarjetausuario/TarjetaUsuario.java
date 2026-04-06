package edu.teamrocket.domain.tarjetausuario;

public class TarjetaUsuario  implements Autenticacion {
    private  String id;
    private Boolean activada;
    public TarjetaUsuario(String id , boolean activada ){
        this.id = id;
        this.activada = activada;
    }
    @Override
    public boolean isActivada(){
        return  this.activada;
    }

    public void setActivada(Boolean activada) {
        this.activada = activada;
    }

    @Override
    public String toString() {
        return "TarjetaUsuario{" +
                "id='" + id + '\'' +
                ", activada=" + activada +
                '}';
    }

}
