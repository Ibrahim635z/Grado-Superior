package Examen;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);
        int minimo=0,maximo=0;
        int cambio=0;
        System.out.println("Ingrese el primer valor:");
        minimo=entrada.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        maximo=entrada.nextInt();
        
        if(minimo>maximo){
            cambio=minimo;
            minimo=maximo;
            maximo=cambio;
        }
       
        for (int i = minimo; i <= maximo ; i++) {
           if(i%2==0){
            System.out.print(i+" ");
           }
        }
        entrada.close();

    }
    
}
