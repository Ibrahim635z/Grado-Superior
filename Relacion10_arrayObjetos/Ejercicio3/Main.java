package POO.src.Relacion10_arrayObjetos.Ejercicio3;

import java.util.Scanner;

import POO.src.Relacion10_arrayObjetos.Ejercicio2.Articulo;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Articulo art1=new Articulo("B001", "Disco de Hockey");
        Articulo art2=new Articulo("B002", "Zapatillas Senderismo");
        
        int tamaño=2;
        
        
        PruebaArticulo prueba = new PruebaArticulo(tamaño); 

        prueba.almacena(art1); 
        prueba.almacena(art2);
        
        System.out.println(prueba);
        
        entrada.close();
    }
}
