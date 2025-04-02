package POO.src.Relacion11_Herencia.Ejercicio5;

public class Tecnico extends Operario {
    String nombre;
    public Tecnico(){

    }

    public Tecnico(String nombre){
        this.nombre=nombre;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nombre + "--> Tecnico";
    }
}
