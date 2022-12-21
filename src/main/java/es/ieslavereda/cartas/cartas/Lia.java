package es.ieslavereda.cartas.cartas;

public enum Lia {
    UNO("A",new int[]{1,11}),
    DOS("2",new int[]{2}),
    TRES("3",new int[]{3}),
    CUATRO("4",new int[]{4}),
    CINCO("5",new int[]{5}),
    SEIS("6",new int[]{6}),
    SIETE("7",new int[]{7}),
    OCHO("8",new int[]{8}),
    NUEVE("9",new int[]{9}),
    DIEZ("J",new int[]{10}),
    ONCE("Q",new int[]{10}),
    DOCE("K",new int[]{10});
    private String shape;
    private int[] valor;

    Lia (String shape , int[] valor){
        this.shape = shape;
        this.valor = valor;
    }

    public String getLetra(){
        return shape;
    }
    public int[] getValor(){
        return valor;
    }
    @Override
    public String toString(){
        return shape;
    }


}
