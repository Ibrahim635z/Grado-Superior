package Relacion6_Strings;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
        System.out.print("Introduzca una cadena. ");
        cadena = entrada.nextLine();
        System.out.println("La cadena es: " +cadena);
/*Tambien se podria usar la cadena.substring que sirve para obtener subcadenas */
        for (int i = 0; i < cadena.length() ; i++) {
            System.out.println(cadena.charAt(i));
            
        }
        entrada.close();
    }
}
