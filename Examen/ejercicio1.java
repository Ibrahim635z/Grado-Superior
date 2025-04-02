package Examen;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
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
}
