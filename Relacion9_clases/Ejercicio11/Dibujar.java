package POO.src.Relacion9_clases.Ejercicio11;

import POO.src.Relacion9_clases.Ejercicio11.Rectangulo;


import java.util.Scanner;

public class Dibujar {
    
    public static void main(String[] args) {
        
    
    
    
    Scanner entrada=new Scanner (System.in);

    Piramide p = new Piramide(4);
    Rectangulo r1 = new Rectangulo(4,3);
    Rectangulo r2 = new Rectangulo(6, 2);

    System.out.println(p);
    System.out.println(r1);
    System.out.println(r2);

    System.out.println("Pirámides creadas: " + Piramide.getPirámidesCreadas());
    System.out.println("Rectángulos creados: " + Rectangulo.getRectángulosCreados());



        entrada.close();
    }
}
