package Autodidacta.Youtube.Ejercicio2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opc,gigas;
        Ordenador pc1=new Ordenador();

        do {
            System.out.println("--Menu--");
            System.out.println("1-Encender PC");
            System.out.println("2-Apagar PC");
            System.out.println("3-Transferir Archivos");
            System.out.println("4-Eliminar archivos");
            System.out.println("5-Salir");
            opc=entrada.nextInt();
            switch (opc) {
                case 1:
                pc1.encender();
                    break;
                case 2:
                pc1.apagar();
                    break;

                case 3:
                System.out.println("Cuantos Gigas tiene el archivo que desea transferir");
                gigas=entrada.nextInt();
                pc1.transferir(gigas);
                    break;
                case 4:
                System.out.println("Cuantos Gigas tiene el archivo que desea eliminar");
                gigas=entrada.nextInt();
                pc1.eliminar(gigas);
                    break;

                case 5:

                    break;
            
                default:
                System.out.println("Selecciona una opcion valida");
                System.out.println("-----------------------");
                    break;
            }
        } while (opc!=5);





        
       





        entrada.close();
    }
    
}
