package Relacion6_Strings;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String cadena="",cadena_final="";
        char letra1=' ', letra2=' ';

        System.out.println("Introduce una frase");
        cadena=entrada.nextLine();
        System.out.println("Introduzca el Primer Caracter");
        letra1=entrada.next().charAt(0);
        System.out.println("Introduzca el Segundo Caracter");
        letra2=entrada.next().charAt(0);


        for (int i = 0; i < cadena.length(); i++) {

            if(cadena.charAt(i)==letra1){
                cadena_final+=letra2;
            }else{
                cadena_final+=cadena.charAt(i);
            }
        }


        System.out.println("La cadena sustiuda es: "+cadena_final);



        entrada.close();

    }
    
}
