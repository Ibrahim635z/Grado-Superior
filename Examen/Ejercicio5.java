package Examen;

import java.util.Scanner;
import Examen.Examen1eva.Ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int opcion=0;
        do{
        System.out.println("Menu de opciones:");
        System.out.println("1. Ejercicio1:");
        System.out.println("2. Ejercicio2:");
        System.out.println("3. Ejercicio3:");
        System.out.println("4. Ejercicio4:");
        System.out.println("5. Ejercicio5:");
        System.out.println("Seleccione las opciones (1-5)");
        opcion=entrada.nextInt();
        }while(opcion>5 && opcion <0);

        switch (opcion) {
            case 1:
                Ejercicios.ejercicio1();
                break;
            case 2:
            Ejercicios.ejercicio2();
                break;
             case 3:
             Ejercicios.ejercicio3();
                break;
            case 4:
            Ejercicios.ejercicio4();
                break;
        
            default:
                break;
        }


        entrada.close();
    }
    
}
