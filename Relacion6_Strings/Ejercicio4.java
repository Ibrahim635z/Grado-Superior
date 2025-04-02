package Relacion6_Strings;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String cadena;
        int cont=1;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce una frase(separadas por espacios)");
        cadena=entrada.nextLine();

        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i)==' ') {
                cont++;
            }
        }

        System.out.println("Hay " +cont+ " Palabras");
        entrada.close();

    }
    
}
