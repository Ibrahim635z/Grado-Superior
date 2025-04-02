package POO.src.Relacion9_clases.Ejercicio3;

public class Perro {
    String raza;
    String color;
    int edad;

    String obtenerRaza(){
        return raza;
    }

    void establecerRaza(String razita){

        raza=razita;
    }

    String obtenercolor(){
        return color;
    }

    void establecercolor(String colorito){
        color=colorito;
    }

    int obtenerEdad(){
        return edad;
    }

    void establecerEdad(int edacita){
        edad=edacita;
    }
}
