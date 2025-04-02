package POO.src.Relacion10_arrayObjetos.Ejercicio4;

import POO.src.Relacion10_arrayObjetos.Ejercicio2.Articulo;
import java.util.Scanner;

public class GestSimAlt {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opc;

        do {
        System.out.println("0. Entrada automatizada (creará 4 artículos de prueba del programa) ");
        System.out.println("1. Listado (Mostrará todos los datos de los artículos del almacén) ");
        System.out.println("2. Alta (Creará un nuevo artículo en el almacén) ");
        System.out.println("3. Baja (Dará de baja un artículo en el almacén) ");
        System.out.println("4. Entrada de mercancía (Aumentará el stock de un determinado artículo) ");
        System.out.println("5. Salida de mercancía (Disminuirá el stock de un determinado artículo) ");
        System.out.println("6. Salir");
        opc=entrada.nextInt();
        
       

        switch (opc) {
                case 0:
                    Articulo.entradaAutomatizada();
                
                break;
                case 1:
                    Articulo.lista();
                break;
                case 2:
                    entrada.nextLine();
                    System.out.println("Dime el codigo del articulo que va dar de alta con el formato Z000 ");
                    String codigo=entrada.nextLine();

                    System.out.println("digame la descripcion del articulo");
                    String descripcion=entrada.nextLine();
                    Articulo art=new Articulo(codigo, descripcion);
                    Articulo.alta(art);
                break;
                case 3:
                    int baja;
                    System.out.println("Diga el numero del articulo que quiere dar de baja");
                    baja=entrada.nextInt();
                    Articulo.baja(baja);
                break;
                case 4:
                    int sumar;
                    System.out.println("Digame el numero del articulo que le va aumentar la mercancia");
                    sumar=entrada.nextInt();
                    Articulo.entradaMercancia(sumar);
                break;
                case 5:
                int restar;
                System.out.println("Digame el numero del articulo que le va disminuir la mercancia");
                restar=entrada.nextInt();
                Articulo.salidaMErcancia(restar);
                break;
        
            default:
                break;
        }


    } while (opc!=6 );


        entrada.close();
    }
}
