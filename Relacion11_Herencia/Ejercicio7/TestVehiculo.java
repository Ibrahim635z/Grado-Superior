package POO.src.Relacion11_Herencia.Ejercicio7;

import java.util.Scanner;

public class TestVehiculo {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int opcion;
        String tipo="estatica";
        String marca="Fiat";
        Bicicleta bicicleta1 = new Bicicleta(tipo);
        Coche coche1 = new Coche(marca);
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("VEHÍCULOS");
            System.out.println("===========");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("9. Arrancar el coche");
            System.out.println("10. Apagar el coche");
            System.out.println("11. Estado del coche");
            System.out.print("Elige una opción (1-8): ");
            

            opcion = scanner.nextInt();

            System.out.println("----------------------------------------------------");

            switch (opcion) {
                case 1:
                    
                    bicicleta1.avanzarBicileta();
                    break;
                case 2:
                   
                    bicicleta1.hacerCaballito();
                    break;
                case 3:
                    
                    coche1.avanzarCoche();
                    break;
                case 4:
                    
                    coche1.quemarRueda();
                    break;
                case 5:
                    System.out.println("Mostrando kilometraje de la bicicleta..."+bicicleta1.getKilometrosTotales());
                   
                    break;
                case 6:
                    System.out.println("Mostrando kilometraje del coche..."+coche1.getKilometrosTotales());
                    
                    break;
                case 7:
                    System.out.println("Mostrando kilometraje total...");
                    int km_totales=0;
                    km_totales=bicicleta1.getKilometrosTotales()+coche1.getKilometrosTotales();
                    System.out.println(km_totales);
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                case 9:
                    coche1.Arrancar();
                    break;
                case 10:
                    coche1.Detener();
                    break;
                case 11:
                    coche1.EstarArrancado();
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 8);

     
        scanner.close();
    
    }
    
}
