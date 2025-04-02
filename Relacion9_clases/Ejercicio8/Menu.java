package POO.src.Relacion9_clases.Ejercicio8;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        Zona principal=new Zona(1000);
        Zona compra_venta=new Zona(200);
        Zona vip=new Zona(25);

        //MENU

        int opc=0;
        do {
           System.out.println("------------------------------------");
            System.out.println("1. Mostrar menu de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            opc= entrada.nextInt();
            System.out.println("------------------------------------");
            // validacion de entrada    
            if(opc!=1 & opc!=2 & opc!=3){
                System.out.println("Por favor Introduzca un valor valido");
            }
       
        
        // opciones, la 3 no se contempla porque es salir y por defecto el programa se saldrá

        switch (opc) {
            case 1:
                
            System.out.println("Quedan "+ principal.getEntradasPorVender()+" entradas en la zona Principal por vender.");
            System.out.println("Quedan "+ compra_venta.getEntradasPorVender()+" entradas en la zona Compra-Venta por vender.");
            System.out.println("Quedan "+ vip.getEntradasPorVender()+" entradas en la zona VIP por vender.");
           

                break;
            case 2:
            int num_entradas,zona;
                System.out.println("Para que zona quieres la entrada?");
                System.out.println("1. Sala Principal");
                System.out.println("2. Compra-Venta");
                System.out.println("3. VIP");
                zona=entrada.nextInt();
                System.out.println("Cuantas entradas quieres?");
                num_entradas=entrada.nextInt();
                if(zona==1){
                    principal.vender(num_entradas);
                }
                if(zona==2){
                    compra_venta.vender(num_entradas);
                }
                if(zona==3){
                    vip.vender(num_entradas);
                }
                break;

            default:
                break;
        }
    
    } while (opc!=3);
    
        entrada.close();
    
    }


}
