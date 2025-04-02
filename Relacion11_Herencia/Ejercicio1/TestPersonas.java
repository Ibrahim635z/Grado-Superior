package POO.src.Relacion11_Herencia.Ejercicio1;

import java.util.Scanner;

import POO.src.Relacion11_Herencia.Ejercicio2.Ingeniero;
import POO.src.Relacion11_Herencia.Ejercicio2.Ingeniero_informatico;

public class TestPersonas {
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
        int opc;
        String nif;
        int altura,edad;
        System.out.println("Elija una opcion");
        System.out.println("1.Crear persona por defecto");
        System.out.println("2.Crear persona desde 0");
        System.out.println("3.Jerarquia");
        opc=entrada.nextInt();
        entrada.nextLine();
        switch (opc) {
            case 1:
                Personas p1=new Personas();
                System.out.println(p1);

                break;
            case 2:
                System.out.println("Dime el nif (9 digitos el ultimo una letra)");
                
                nif=entrada.nextLine();
               
                System.out.println("Dime la altura de la persona en cm");
                altura=entrada.nextInt();
                

                System.out.println("Dime la edad de la persona");
                edad=entrada.nextInt();
                
                

                Personas p2=new Personas(nif, altura, edad);
                System.out.println(p2);
                break;
            case 3:

                Ingeniero ing1=new Ingeniero();
                ing1.comer();
                ing1.razonar();
                System.out.println(ing1);

                Ingeniero_informatico ing2=new Ingeniero_informatico();
                ing2.CrearProgramas();
                System.out.println(ing2);

                break;
        
            default:
                break;
        }


         entrada.close();

    }
    
}
