package POO.src.Relacion11_Herencia.Ejercicio5;

public class Oficial extends Operario {
    private String nombre;
    public Oficial(){

    }

    public Oficial(String nombre){
        this.nombre=nombre;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nombre+"--> Oficial";
    }
}
