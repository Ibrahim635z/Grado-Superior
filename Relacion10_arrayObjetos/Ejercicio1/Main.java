package POO.src.Relacion10_arrayObjetos.Ejercicio1;

import java.util.Scanner;

import POO.src.Relacion9_clases.Ejercicio4.Autobus;

public class Main {
    public static void main(String[] args) {

       Scanner entrada=new Scanner(System.in);

         Autobus[] autobus= new Autobus[4];
        int[] plaza=new int[4];
        for (int i = 0; i < autobus.length; i++) {
            autobus[i]=new Autobus();
            System.out.println("Dime las plazas del Autobus " +(i+1));
            plaza[i]=entrada.nextInt();
           autobus[i].setnumeroPlaza(plaza[i]);
            
        }

        for (int i = 0; i < autobus.length; i++) {
            System.out.println("El autobus " +(i+1)+ " Tiene " +autobus[i].getnumeroPlaza()+ " Plazas");
            

        }

        entrada.close();
    }
}
