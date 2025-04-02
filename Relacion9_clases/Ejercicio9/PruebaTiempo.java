package POO.src.Relacion9_clases.Ejercicio9;

import java.util.Scanner;

public class PruebaTiempo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
       
        

        int opc=0;
        int horas,minutos,segundos;
        int horas2,minutos2,segundos2;

        System.out.println("Dime las horas,minutos y segundos del primer tiempo");
        System.out.println("Dime las horas");
        horas=entrada.nextInt();
        System.out.println("Dime los minutos");
        minutos=entrada.nextInt();
        System.out.println("Dime los segundos");
        segundos=entrada.nextInt();

        Tiempo t1=new Tiempo(horas,minutos,segundos);

        System.out.println("---------------------");
        System.out.println("Dime las horas,minutos y segundos del segundo tiempo");
        System.out.println("Dime las horas");
        horas2=entrada.nextInt();
        System.out.println("Dime los minutos");
        minutos2=entrada.nextInt();
        System.out.println("Dime los segundos");
        segundos2=entrada.nextInt();
        
        Tiempo t2=new Tiempo(horas2,minutos2,segundos2);
        
        do {
            
        System.out.println("------------------");
        System.out.println("Elija una opcion:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        opc=entrada.nextInt();

        if(opc==1){
          

            t1.suma(t2);
          System.out.println(t1);
            
            } else if (opc==2){
                t1.resta(t2);
                System.out.println(t1);
            } else{
                
            System.out.println("------------------");
            System.out.println("Introduzca una opcion valida");
            
            }

         } while (opc!=1 && opc!=2);






        entrada.close();
    }
    
}
