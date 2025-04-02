package Examen.Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        ArrayList<Vehiculo> lista_Vehiculos=new ArrayList<>();
        int opc=0;


       Turismo t1=new Turismo("1124KKZ", "Kia", "Sportage","Rojo");
       Turismo t2=new Turismo("2345MVS", "Reanult", "Clio","Verde");

       Furgo f1=new Furgo("1245LOS", "Renault", "Kangoo", 5000 , 200, 7, true, true);
       Furgo f2=new Furgo("7685TRY", "Honda", "Trimax", 2000 , 100, 5, false, true);

       Camion c1=new Camion("8372CAM", "Daewoo", "Lanoos", 10000, 800);
       Camion c2=new Camion("5342CAM", "Mazda", "Terracan", 8000, 600);

        lista_Vehiculos.add(t1);
        lista_Vehiculos.add(t2);
        lista_Vehiculos.add(f1);
        lista_Vehiculos.add(f2);
        lista_Vehiculos.add(c1);
        lista_Vehiculos.add(c2);

        System.out.println("----INFO VEHICULOS----");
        for (Vehiculo veh : lista_Vehiculos) {
            System.out.println(veh);
        }
        System.out.println("----CON TURISMOS----");
        t1.alquilar();
        t1.alquilar();
        t1.devolver();
        t1.devolver();
        System.out.println("----CON FURGOS----");
        f1.alquilar();
        f1.alquilar();
        f1.devolver();
        f1.devolver();
        System.out.println("----CON CAMIONES----");
        c1.alquilar();
        c1.alquilar();
        c1.devolver();
        c1.devolver();

        c1.alquilar();
        c1.devolver();
        c1.alquilar();
        
      
       


        System.out.println("----INFO VEHICULOS----");

        for (Vehiculo veh : lista_Vehiculos) {
            System.out.println(veh);
        }


       /* do {
        switch (opc) {
            System.out.println("---Menu---");
            System.out.println("Elija una opcion");
            System.out.println("---Menu---");
            System.out.println("---Menu---");
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
        
            default:
                break;
        }
       } while (opc!=6);*/ 
       


       entrada.close();

    }

  
}
