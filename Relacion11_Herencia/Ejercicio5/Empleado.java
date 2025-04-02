package POO.src.Relacion11_Herencia.Ejercicio5;

public abstract class Empleado {
    private String nombre;

    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public abstract String toString();
}