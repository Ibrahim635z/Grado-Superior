package Examen.Examen1eva;

import java.util.Scanner;

public class Ejercicios {
    public static void ejercicio1(){
        Scanner entrada=new Scanner (System.in);
      
        String opcion="", sabor_chocolate="", nata="",nombre="";
       
        double valor_tarta=0,valor_nata=0,valor_nombre=0,valor_total=0;


        
            
       
        System.out.println("Elija el sabor de la tarta(manzana,pionono,chocolate):");
        opcion=entrada.nextLine();
        
        switch (opcion) {
            case "manzana":
            valor_tarta=18;
                break;
            case "pionono":
            valor_tarta=16;
                break;
            case "chocolate":
            System.out.println("chocolate negro o blanco?");
                sabor_chocolate=entrada.nextLine();
                 if(sabor_chocolate.equals("negro")){
                valor_tarta=14;
                }else if(sabor_chocolate.equals("blanco")){
                valor_tarta=15;
                }
                break;
        
            default:
                break;
        }
   
        
       
        System.out.println("quiere nata?");
        nata=entrada.nextLine();
        if(nata.equals("si")){
            valor_nata=2.50;
        }else{
            valor_nata=0;
        }
    
        System.out.println("quiere ponerle su nombre?");
        nombre=entrada.nextLine();
        if(nombre.equals("si")){
            valor_nombre=2.75;
        }else valor_nombre=0;

        valor_total=valor_tarta+valor_nata+valor_nombre;
        System.out.println("Coste total= "+valor_total);


        entrada.close();

    }

    public static void ejercicio2(){
        Scanner entrada=new Scanner (System.in);
        int minimo=0,maximo=0;

        System.out.println("Ingrese el primer valor:");
        minimo=entrada.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        maximo=entrada.nextInt();

       
        for (int i = minimo; i <= maximo ; i++) {
           if(i%2==0){
            System.out.print(i+" ");
           }
        }
        entrada.close();

    }

    public static void ejercicio3(){
        Scanner entrada=new Scanner (System.in);

        int tirada1, tirada2;
        int repetir=0,distinto=0,valor_superior=0;
        int array[][]=new int[10][2];
        
       
        for (int i = 0; i < 10; i++) {
            tirada1=(int) (Math.random()*6);
            tirada2=(int) (Math.random()*6);
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
    
    public static void ejercicio4(){
        Scanner entrada=new Scanner (System.in);
        int cambio=0;
        int tiempo[][]=new int[3][4];
        for (int fila = 0; fila < tiempo.length; fila++) {
            for (int columna = 0; columna < tiempo[fila].length; columna++) {
               if(columna!=3){
                switch (columna) {
                case 0:
                    tiempo[fila][columna]=(int) (Math.random()*15+15);
                    if(tiempo[0][columna]>tiempo[1][columna]){
                        cambio=tiempo[0][columna];
                        tiempo[0][columna]=tiempo[1][columna];
                        tiempo[1][columna]=cambio;
                    }
                    break;
                case 1:
                tiempo[fila][columna]=(int) (Math.random()*20+25);
                if(tiempo[0][columna]>tiempo[1][columna]){
                    cambio=tiempo[0][columna];
                    tiempo[0][columna]=tiempo[1][columna];
                    tiempo[1][columna]=cambio;
                }
                    break;
                case 2:
                tiempo[fila][columna]=(int) (Math.random()*10+20);
                if(tiempo[0][columna]>tiempo[1][columna]){
                    cambio=tiempo[0][columna];
                    tiempo[0][columna]=tiempo[1][columna];
                    tiempo[1][columna]=cambio;
                }
                    break;
                case 3:
                tiempo[fila][columna]=(int) (Math.random()*25);
                if(tiempo[0][columna]>tiempo[1][columna]){
                    cambio=tiempo[0][columna];
                    tiempo[0][columna]=tiempo[1][columna];
                    tiempo[1][columna]=cambio;
                }
                    break;
               
                default:
                    break;
               }
            }else{

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


