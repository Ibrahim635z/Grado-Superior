package Relacion6_Strings;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String nombre;
        String iniciales="";
        Scanner entrada=new Scanner(System.in);


        System.out.println("Ingrese su nombre y apellidos(separados por espacios)");
        nombre=entrada.nextLine();

        iniciales+=nombre.charAt(0);
        
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i)==' '){
            iniciales+=nombre.charAt(i+1);
            }
        }

        System.out.println("Sus iniciales son: "+iniciales.toUpperCase());



        entrada.close();
    }
    
}
