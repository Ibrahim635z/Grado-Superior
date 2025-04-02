package POO.src.Relacion10_arrayObjetos.Ejercicio5;

public class Autores {

    String nombre,nacionalidad;

    public Autores(String nombre,String nacionalidad){
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Nacionalidad: " + nacionalidad;
    }

    
}
