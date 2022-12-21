package es.ieslavereda.cartas.persona;

public enum Sexo {
    HOMBRE("Hombre"),
    MUJER("Mujer"),
    NO("No");

    private String texto;

    Sexo(String texto){
        this.texto = texto;
    }
}
