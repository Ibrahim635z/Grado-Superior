package Relacion6_Strings;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
            String cadena="",subcadena="";
            boolean contenedor=false;


           System.out.println("Introduzca una cadena");
            cadena=entrada.nextLine();
            System.out.println("Introduzca una subcadena");
            subcadena=entrada.nextLine();
           
          

            contenedor=cadena.contains(subcadena);
            if (contenedor==true){
                System.out.println("Si, la cadena contiene la subcadena");

            }else{
                System.out.println("No, la cadena no contiene la subcadena");
            }
          


         entrada.close();

    }
    
}
