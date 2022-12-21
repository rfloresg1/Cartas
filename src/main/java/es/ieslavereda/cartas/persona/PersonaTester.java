package es.ieslavereda.cartas.persona;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class PersonaTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion = Input.getString("Quieres introducir el DNI: ").toUpperCase();
        while (!opcion.equals("SI") && !opcion.equals("NO")){
             opcion = Input.getString("Introduce si o no: ").toUpperCase();

         if (opcion.equals("SI")){
             String nombre = Input.getString("Introduce el nombre");
             String apellidos = Input.getString("Introduce el apellido");
             int edad = Input.getInteger("Introduce la edad");
             Sexo sexo = Sexo.NO;
         }
        }

    }
}
