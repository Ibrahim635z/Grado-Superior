package POO.src.Relacion9_clases.Ejercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        Punto p1=new Punto(4.21, 7.3);
        Punto p2=new Punto(-2, 1.66);
        Linea l=new Linea(p1,p2);

        System.out.println(l);
        




        entrada.close();
    }
}
