package es.ieslavereda.cartas.password;

public class Password {
    private static final int longitud = 10;
    private String contraseña;

    public Password(int longitud){

    }

    public static int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }
}
