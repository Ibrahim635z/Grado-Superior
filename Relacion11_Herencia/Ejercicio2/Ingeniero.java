package POO.src.Relacion11_Herencia.Ejercicio2;

import POO.src.Relacion11_Herencia.Ejercicio1.Personas;

public class Ingeniero extends Personas {

   public Ingeniero(){
    super();
   }

    public void razonar(){
        System.out.println("Pienso luego existo");
    }

    public void trabajarEnGrupo(){
        System.out.println("Soy trabajador grupal!");
    }
    
}
