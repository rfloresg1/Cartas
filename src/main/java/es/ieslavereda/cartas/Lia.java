package es.ieslavereda.cartas;

public enum Lia {
    UNO("A"),
    DOS("2"),TRES("3"),CUATRO("4"),CINCO("5"),SEIS("6"),SIETE("7"),OCHO("8"),NUEVE("9"),DIEZ("J"),
    ONCE("Q"),DOCE("K");
    String shape;
    Lia (String shape){
        this.shape = shape;
    }

    public String getLetra(){
        return shape;
    }
    @Override
    public String toString(){
        return shape;
    }
}
