package Relacion12_Colecciones.Ejercicio4;

import java.util.HashSet;
import java.util.Scanner;

public class SumaHashset {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa 5 números diferentes:");

        while (numeros.size() < 5) {
            System.out.print("Número: ");
            int numero = entrada.nextInt();

            if (numeros.contains(numero)) {
                System.out.println("El número ya existe. Ingresa uno diferente.");
            } else {
                numeros.add(numero);
            }
        }

        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }

        System.out.println("La suma de los números es: " + suma);
        entrada.close();
    }
}
