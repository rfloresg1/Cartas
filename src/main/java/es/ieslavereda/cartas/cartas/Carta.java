package es.ieslavereda.cartas.cartas;

public class Carta {
    private Palo palo;
    private Lia numero;

    public Carta (Palo palo, Lia numero){
        this.palo = palo;
        this.numero = numero;
    }

    public Lia getNumero() {
        return numero;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public String toString(){
        return numero + " " + palo;
    }
}
