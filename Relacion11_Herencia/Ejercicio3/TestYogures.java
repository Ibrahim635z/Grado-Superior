package POO.src.Relacion11_Herencia.Ejercicio3;

import java.util.Scanner;

public class TestYogures {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Yogur yogur1 = new Yogur();
        YogurDesnatado yogurDesnatado = new YogurDesnatado();

        System.out.println(yogur1);
        System.out.println(yogurDesnatado);
        
        entrada.close();
    }
   
}
