package Relacion12_Colecciones.Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<String> opciones;
    public Menu(){
        opciones=new ArrayList<>();
    }
    public void Crearopcion(String opcion){
        opciones.add(opcion); // agregar opcion a la lista
    }
    public void Muestramenu(){
        System.out.println("----Menu----");
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println((i+1)+"."+opciones.get(i));
        }
    }
    public int Metodocaptura(){
        Scanner entrada=new Scanner(System.in);
        int opcion=0;

        do {
            System.out.println("Introduce una opcion (1." +opciones.size()+"): ");
            opcion=entrada.nextInt();
            
        } while (opcion<1 || opcion>opciones.size());

        entrada.close();
        return opcion;
    }
}
