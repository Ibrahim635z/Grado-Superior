package Relacion12_Colecciones.EjercicioArrayList;

import java.util.Scanner;

public class TestGestSimAlm {
    public static void main(String[] args) {
        GestSimAlm almacen = new GestSimAlm();
        Scanner entrada = new Scanner(System.in);
        
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer
           
            switch (opcion) {
                case 0:
                    almacen.entradaAutomatizada();
                    break;
                case 1:
                    almacen.lista();
                    break;
                case 2:
                int codigo;
                String descripcion;
                System.out.println("Dime el codigo");
                codigo=entrada.nextInt();
                entrada.nextLine();
                System.out.println("dime la descripcion");
                descripcion=entrada.nextLine();
                Articulo a1=new Articulo(codigo, descripcion);
                   almacen.alta(a1);
                    break;
                case 3:
                    almacen.lista();
                    int codigo2;
                String descripcion2;
                System.out.println("Dime el codigo");
                codigo2=entrada.nextInt();
                entrada.nextLine();
                System.out.println("dime la descripcion");
                descripcion2=entrada.nextLine();
                Articulo a2=new Articulo(codigo2, descripcion2);
                    almacen.baja(a2);
                break;
                case 4:
                System.out.println("Cuanta mercancia quieres añadir?");
                int stock_entrada=0;
                stock_entrada=entrada.nextInt();
                   almacen.entradaMercancia(a1, stock_entrada);
                    break;
                case 5:
                System.out.println("Cuanta mercancia quieres sacar");
                int stock_salida=0;
                stock_salida=entrada.nextInt();
                    almacen.salidaMercancia(a1, stock_salida);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println(); // Salto de línea para mejor visualización
        } while (opcion != 6);

        entrada.close();
    }

    public static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("0. Entrada automatizada");
        System.out.println("1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Entrada de mercancía");
        System.out.println("5. Salida de mercancía");
        System.out.println("6. Salir");
    }
    
}
