package POO.src.Autodidacta.ejercicio1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opc,tipo=0;
        MontanaRusa montana=new MontanaRusa("Montaña rusa", 5.50f, 1);

        System.out.println("Elije una atraccion:");
        System.out.println("1.Montaña rusa");

        opc=entrada.nextInt();

        switch (opc) {
            case 1:
            float precio;
                System.out.println("Selecciona una opcion");
                System.out.println("1.Adulto");
                System.out.println("2.Niño");
                tipo=entrada.nextInt();
                montana.setTipo(tipo);
               precio=montana.calcularPrecioFinal();
            System.out.println("El precio de La montaña rusa es de " +precio);
                break;
        
            default:
                break;
        }

      
        entrada.close();
    }
}
