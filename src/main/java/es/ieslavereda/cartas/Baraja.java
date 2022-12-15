package es.ieslavereda.cartas;

public class Baraja {
    private Palo palo;
    private Carta[] cartas;

    public Baraja(){
        cartas = new Carta[48];
        int j= 0;
        for (Palo palo: Palo.values()) {
            for (Lia lia : Lia.values()) {
            cartas[j++] = new Carta(palo,lia);
            }
        }

        }
    @Override
    public String toString(){
        String barajaCadena = "";
        for(Carta carta : cartas)
            barajaCadena += carta.toString() + "\n";
        return barajaCadena;
    }

}
