package Examen;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int cambio[][]=new int[1][1];
        int tiempo[][]=new int[3][4];
        String cielo[][]=new String [1][4];
        for (int fila = 0; fila < tiempo.length; fila++) {
            for (int columna = 0; columna < tiempo[fila].length; columna++) {
                if(columna==0 && fila!=2){
              
        
                switch (columna) {
                case 0:
                tiempo[fila][columna]=(int) (Math.random()*15+15);
                    break;
                case 1:
                tiempo[fila][columna]=(int) (Math.random()*20+25);
               
                    break;
                case 2:
                tiempo[fila][columna]=(int) (Math.random()*10+20);
               
                    break;
                case 3:
                tiempo[fila][columna]=(int) (Math.random()*25);
               
                    break;
               
                default:
                    break;
               } 
            }else{
                
                switch (columna) {
                    case 0:
                    tiempo[fila][columna]=(int) (Math.random()*100);
                    if(tiempo[fila][columna]<=40){
                        cielo[1][0]="nublado";
                    } else cielo[1][0]="soleado";
                        break;
                    case 1:
                    tiempo[fila][columna]=(int) (Math.random()*100);
                    if(tiempo[fila][columna]<=20){
                        cielo[1][0]="nublado";
                    } else cielo[1][0]="soleado";
                        break;
                    case 2:
                    tiempo[fila][columna]=(int) (Math.random()*100);
                    if(tiempo[fila][columna]<=60){
                        cielo[1][0]="nublado";
                    } else cielo[1][0]="soleado";
                   
                        break;
                    case 3:
                    tiempo[fila][columna]=(int) (Math.random()*100);
                    if(tiempo[fila][columna]<=0){
                        cielo[1][0]="nublado";
                    } else cielo[1][0]="soleado";
                      
                   
                        break;
                   
                    default:
                        break;
                   }

            }
            }
            System.out.println();
        }

        int opcion=0;
        System.out.println("1. Primavera");
        System.out.println("2. verano");
        System.out.println("3. otoño");
        System.out.println("4. invierno");
        System.out.println("Seleccione la estacion del año(1-4)");
        opcion=entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("temperatura minima: ");
                System.out.println(tiempo[0][0]);
                System.out.print("temperatura maxima: ");
                System.out.println(tiempo[1][0]);
                break;
            case 2:
            System.out.print("temperatura minima: ");
            System.out.println(tiempo[0][0]);
            System.out.print("temperatura maxima: ");
            System.out.println(tiempo[1][0]);
                break;
            case 3:

                break;
        
            default:
                break;
        }

        entrada.close();
    }
    
}
