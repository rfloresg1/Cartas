package es.ieslavereda.cartas;

public class Jugador {

    private String nombre;
    private Carta[] mano;

    public Jugador(String nombre, Carta[] mano){
        this.nombre = nombre;
        this.mano = mano;
    }

    public String getNombre() {
        return nombre;
    }
}
