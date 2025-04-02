package Relacion6_Strings;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        String cadena="", cadena_invertida="";
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Introduzca la frase que desea invertir");
        cadena=entrada.nextLine();
        
        for (int i = cadena.length()-1; i>=0; i--) {
           cadena_invertida+=cadena.charAt(i);
          
        }

        System.out.println("La frase invertida es: " +cadena_invertida);

        entrada.close();
    }
    
}
