package ENUM.Ejemplo1;

public class Main {
    
    
        public static void main(String[] args) {
            Demarcacion delantero = Demarcacion.PORTERO;
            Demarcacion otro = Demarcacion.DELANTERO;     // Instancia de un enum de la clase Demarcación
            delantero.name();    // Devuelve un String con el nombre de la constante (DELANTERO)
            delantero.toString();    // Devuelve un String con el nombre de la constante (DELANTERO)
            delantero.ordinal();    // Devuelve un entero con la posición del enum según está declarada (3).
            delantero.compareTo(otro);  // Compara el enum con el parámetro según el orden en el que están declarados lo enum
        Demarcacion.values();    // Devuelve un array que contiene todos los enum

       
        System.out.println(delantero.name());
        System.out.println(delantero.toString());
        System.out.println(delantero.ordinal());

    for(Demarcacion d: Demarcacion.values()){
             
            System.out.println(d.toString() + " ");
       }


       
        System.out.println(delantero.compareTo(otro));
    }
    
}
