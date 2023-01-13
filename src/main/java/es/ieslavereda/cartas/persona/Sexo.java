package es.ieslavereda.cartas.persona;

public enum Sexo {
    H("Hombre"),
    M("Mujer"),
    N("No");

    private String texto;

    Sexo(String texto){
        this.texto = texto;
    }
}
