package es.ieslavereda.cartas.persona;

import java.util.Scanner;

public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private Sexo sexo;
    private double kilos;
    private double altura;

    private static final int BAJOPESO = -1;
    private static final int NORMAL = -0;
    private static final int SOBREPESO = 1;
    private static final int OBESO = 2;


    public Persona (String nombre, String apellidos,int edad){
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.edad = edad;
    }

    public Persona (String nombre, String apellidos,int edad, String dni, Sexo sexo, double kilos, double altura){
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.setKilos(kilos);
        this.setAltura(altura);
    }

    public int calcularIMC(double kilos, double altura){
        double imc = kilos/(Math.pow(altura,2));
        if (imc < 18.5)
            return BAJOPESO;
        if (imc > 18.5 && imc < 24.99)
            return NORMAL;
        if (imc > 25.00 && imc < 29.99)
            return SOBREPESO;

        return OBESO;

    }

    public boolean esMayorDeEdad(int edad){
        if (edad >= 18){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + " Apellidos: " + getApellidos() + " Edad: " + getEdad() + " DNI: " + getDni() + " Sexo: " + getSexo() + " Kilos: " + getKilos() + " Altura: " + getAltura();
    }

    public String generaDNI(){
        Scanner sc = new Scanner(System.in);
        String [] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int numero = (int)(Math.random()*1000000000);

        return letras[numero % letras.length];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public Sexo getSexo() {
        return sexo;
    }
}
