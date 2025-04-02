package Relacion6_Strings;
import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont=0;
        String cadena;
        char caracter;
        System.out.print("Introduzca una cadena. ");
        cadena = entrada.nextLine();
        System.out.print("Introduzca un caracter ");
        caracter = entrada.next().charAt(0);

        for (int i = 0; i < cadena.length(); i++) {

            if (caracter==cadena.charAt(i)) {
                cont++;
            }
        }

        System.out.println("El Caracter '"+caracter+ "' aparece en '"+ cadena+"' "+cont+ " veces");
        

        entrada.close();
        
       
    }
}
