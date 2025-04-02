package Relacion6_Strings;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String frase="", frase_cambiada="";
        System.out.println("Introduzca una frase con Mayusculas y minusculas");
        frase=entrada.nextLine();
        
        for (int i = 0; i < frase.length(); i++) {
            char letras=frase.charAt(i);
            if(Character.isLowerCase(letras)){
                frase_cambiada+=Character.toUpperCase(letras);
            }else{
                    frase_cambiada+=Character.toLowerCase(letras);
                }

            
        }


        System.out.println("La frase modificada resultante es: "+frase_cambiada);

        entrada.close();
    }
    
}
