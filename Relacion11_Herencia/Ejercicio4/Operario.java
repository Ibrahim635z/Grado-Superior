package POO.src.Relacion11_Herencia.Ejercicio4;

public class Operario extends Empleado {
    public Operario(){
        super();
    }
    public Operario(String nombre){
        super(nombre);
    }
    @Override
    public String toString() {
        
        return super.toString() + "--> Operario";
    }
}
