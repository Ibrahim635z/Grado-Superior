package POO.src.Relacion10_arrayObjetos.Ejercicio5;

import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String nombre="",nacionalidad="";
        String codigo,titulo;
        Autores autor1=new Autores(nombre,nacionalidad);
        int opc;

        System.out.println("Que desea realizar:");
        System.out.println("1. Introducir Autor");
        System.out.println("2. Introducir Libro");
        System.out.println("3. Consultar cantidades");
        opc=entrada.nextInt();
        entrada.nextLine();
        switch (opc) {
            case 1:
            System.out.println("Dime el nombre del autor");
            nombre=entrada.nextLine();
            System.out.println("Dime la nacionalidad del autor");
            nacionalidad=entrada.nextLine();
    
            
    
            System.out.println(autor1);
                break;
            case 2:
            System.out.println("dime codigo libro");
            codigo=entrada.nextLine();
            
            //no me deja recoger los dos valores
            System.out.println("dime titulo libro");
            titulo=entrada.nextLine();
            
            System.out.println("Dime el nombre del autor");
            nombre=entrada.nextLine();
            
            System.out.println("Dime la nacionalidad del autor");
            nacionalidad=entrada.nextLine();
            
    
            Libros libro1=new Libros(codigo, titulo, new Autores (nombre,nacionalidad));
    
            System.out.println(libro1);
                break;
            case 3:

                break;
        
            default:
                break;
        }
       

     

        entrada.close();
    }
}
