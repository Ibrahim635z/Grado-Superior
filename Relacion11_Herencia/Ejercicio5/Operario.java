package POO.src.Relacion11_Herencia.Ejercicio5;

public abstract class Operario extends Empleado {
    public Operario(){
        super();
    }
    public Operario(String nombre){
        super(nombre);
    }
    @Override
    public abstract String toString();
    
}
