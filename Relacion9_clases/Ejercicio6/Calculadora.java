package POO.src.Relacion9_clases.Ejercicio6;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Fraccion fraccion1= new Fraccion();
        Fraccion fraccion2 = new Fraccion();
        Fraccion resultado = new Fraccion();
        
        Scanner entrada= new Scanner (System.in);

        int numerador,denominador;
        int numerador2,denominador2;
        
        int opc;
        

        System.out.println("Que accion desea realizar?");
        System.out.println("-------------------------------------------");
        System.out.println("1. Invertir la fraccion");
        System.out.println("2. Multiplicar la fraccion");
        System.out.println("3. Simplificar la fraccion");
        System.out.println("4. Dividir la fraccion");
        System.out.println("-------------------------------------------");
        System.out.printf("Pulse una tecla del 1 al 4:");
        opc= entrada.nextInt();

        System.out.printf("Digame el numerador: ");
        numerador=entrada.nextInt();

        System.out.printf("Digame el denominador: ");
        denominador=entrada.nextInt();

        fraccion1.setFraccion(numerador,denominador);
    
        
        switch (opc) {
            case 1:
            
            fraccion1.invierte();
            System.out.printf("La fracción inversa es %d/%d\n", fraccion1.getNumerador(),fraccion1.getDenominador());

                break;
            case 2:

            
            System.out.println("Ingrese el segundo numerador");
            numerador2=entrada.nextInt();
            System.out.println("Ingrese el segundo denominador");
            denominador2=entrada.nextInt();

            fraccion2.setFraccion(numerador2,denominador2);

            resultado = Fraccion.MultiplicaFraccion(fraccion1, fraccion2); 

        System.out.printf("La multiplación de fraccion1 y fraccion2 es %d/%d", resultado.getNumerador(),resultado.getDenominador());
            
            

                break;
            case 3:
            int mcd;
            mcd=fraccion1.MCD(fraccion1);
            resultado= Fraccion.SimplificaFraccion(fraccion1, mcd);
            System.out.println();
            System.out.println("La fraccion "+fraccion1.getNumerador()+"/"+fraccion1.getDenominador()+" simplificada es: " +resultado.getNumerador()+"/"+resultado.getDenominador()+  " y su MCD es: " +mcd);

                break;
            case 4:
            
           
            System.out.println("Ingrese el segundo numerador");
            numerador2=entrada.nextInt();
            System.out.println("Ingrese el segundo denominador");
            denominador2=entrada.nextInt();

            fraccion2.setFraccion(numerador2,denominador2);
            resultado= Fraccion.divideFraccion(fraccion1,fraccion2);
            System.out.printf("La division de fraccion1 y fraccion 2 es: %d/%d", resultado.getNumerador(),resultado.getDenominador());
           
                break;
        
            default:
                break;
        }
        
        


        entrada.close();
    }
    

}
