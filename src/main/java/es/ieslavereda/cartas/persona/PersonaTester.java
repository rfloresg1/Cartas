package es.ieslavereda.cartas.persona;

import java.util.Scanner;

public class PersonaTester {
    public static void main(String[] args) {
        Persona[] personas = new Persona[1];
        Sexo sexo;
        Scanner sc = new Scanner(System.in);
        String opcion = Input.getString("Quieres introducir el DNI: ").toUpperCase();
        while (!opcion.equals("SI") && !opcion.equals("NO")) {
            opcion = Input.getString("Introduce si o no: ");
            opcion = opcion.toUpperCase();
        }
        if (opcion.equals("SI")) {
            for (int i = 0; i < personas.length; i++) {
                String nombre = Input.getString("Introduce el nombre: ");
                String apellido = Input.getString("Introduce el apellido: ");
                int edad = Input.getInteger("Introduce la edad: ");
                String dni = Input.getString("Introduce el dni: ");
                System.out.println("Introduce tu sexo (Poner solo la letra) H = Hombre - M = Mujer - N = No");
                String sexoPantalla = sc.next().toUpperCase();
                if (sexoPantalla.equals("M")){
                    sexo = Sexo.M;
                }if (sexoPantalla.equals("H")) {
                    sexo = Sexo.H;
                }else {
                    sexo = Sexo.N;
                }
                double kilos = Input.getDouble("Introduce tu peso: ");
                double altura = Input.getDouble("Introduce tu altura en metros: ");
                personas[i] = new Persona(nombre, apellido, edad, dni, sexo, kilos, altura);
            }

        } else {
            for (int i = 0; i < personas.length; i++) {
                System.out.println(i+".Persona");
                String nombre = Input.getString("Introduce el nombre: ");
                String apellido = Input.getString("Introduce el apellido: ");
                int edad = Input.getInteger("Introduce la edad: ");
                personas[i] = new Persona(nombre, apellido, edad);
                personas[i].generaDNI();
            }

        }
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
            System.out.println(personas[i].pesoIdeal(personas[i].getKilos(),personas[i].getAltura()));
            System.out.println(personas[i].esMayorDeEdad(personas[i].getEdad()));

        }

    }

}
