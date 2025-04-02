package POO.src.Relacion9_clases.Ejercicio13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        int opc;
        //gestionar la creacion de varios cubos con for
        Cubo c1=new Cubo(10,2);
        Cubo c2=new Cubo(10,8);
        do {
            System.out.println("Que accion quiere realizar:");
            System.out.println("1.Informacion cubos");
            System.out.println("2.Transferir litros");
            opc=entrada.nextInt();
            
       

        switch (opc) {
            case 1:
            System.out.println(c1);
            System.out.println(c2);
            opc=3;
                break;
            case 2:
                int opc2;
                System.out.println("Cuantos litros quiere transferir");
                opc2=entrada.nextInt();
                if (c1.cant_litros >= opc2 && c2.cant_litros + opc2 <= c2.cap_max) {
                    c1.RestaLitros(opc2);
                    c2.SumarLitros(opc2);
                } else if (c1.cant_litros < opc2) {
                    System.out.println("El cubo origen no tiene suficientes litros para transferir.");
                } else {
                    System.out.println("El cubo destino no puede recibir tantos litros porque supera su capacidad maxima");
                }
                opc=3;
                break;
        
            default:
                break;
        }
       
    } while (opc!=1 && opc!=2);

        entrada.close();
    }
}
