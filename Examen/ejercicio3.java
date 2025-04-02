package Examen;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);

        int tirada1, tirada2;
        int repetir=0,distinto=0,valor_superior=0;
        int array[][]=new int[10][2];
        
       
        for (int i = 0; i < 10; i++) {
            tirada1=(int) (Math.random()*6+1);
            tirada2=(int) (Math.random()*6+1);
            System.out.println("dado1: "+tirada1+" dado2:" +tirada2);

            for (int fila = 0; fila < array.length; fila++) {
                for (int columna = 0; columna < array[fila].length; columna++) {
                    if(columna==0){
                        array[fila][columna]=tirada1;
                    }else  array[fila][columna]=tirada2;
                       
                }
            }

            if(tirada1==tirada2){
                repetir++;
            }else distinto++;
            if(tirada1>tirada2){
                valor_superior++;
            }
       
        }
        System.out.println("Los resultados se repiten: " +repetir+" veces");
        System.out.println("Los resultados son distintos: " +distinto+" veces");
        System.out.println("El primer dado tiene un valor superior: " +valor_superior+" veces");

        entrada.close();
    }
    
}
