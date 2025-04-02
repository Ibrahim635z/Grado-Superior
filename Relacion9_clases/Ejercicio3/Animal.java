package POO.src.Relacion9_clases.Ejercicio3;

public class Animal {
    String nombre;
    String tipo;
    String zona;
    String color;

    String obtenertipo(){
        return tipo;
    }
    void establecertipo(String tipito){
        tipo=tipito;
        
    }
    String obtenerzona(){
        return zona;
    }
    void establecerzona(String zonita){
        zona=zonita;
        
    } 
    String obtenercolor(){
        return color;
    }
    void establecercolor(String colorito){
        color=colorito;
        
    }
}
