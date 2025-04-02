package POO.src.Relacion11_Herencia.Ejercicio4;

public class Tecnico extends Operario {

    public Tecnico(){

    }

    public Tecnico(String nombre){
        super(nombre);
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"--> Tecnico";
    }
}
