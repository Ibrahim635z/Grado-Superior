package Relacion6_Strings;
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String cadena;
        String subcadena;
        boolean comprobar;
        System.out.print("Introduzca La primera cadena. ");
        cadena = entrada.nextLine();
        System.out.print("Introduzca La Subcadena. ");
        subcadena = entrada.nextLine();

        comprobar=cadena.startsWith(subcadena);
        if (comprobar== true) {

            System.out.println("Si pertenece a la subcadena");
        } else {
            System.out.println("No pertenece a la subcadena");
            
        }
     
        entrada.close();
    }
}
