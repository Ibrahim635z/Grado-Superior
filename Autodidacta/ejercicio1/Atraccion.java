package POO.src.Autodidacta.ejercicio1;

public abstract class Atraccion {
    String nombre;
    float precioEntrada;
    int duracion;
    
    public Atraccion(String nombre,float precioEntrada,int duracion){
        this.nombre=nombre;
        this.precioEntrada=precioEntrada;
        this.duracion=duracion;
    }
    abstract float calcularPrecioFinal();

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecioEntrada(float precioEntrada) {
        this.precioEntrada = precioEntrada;
    }
    public int getDuracion() {
        return duracion;
    }
    public String getNombre() {
        return nombre;
    }
    public float getPrecioEntrada() {
        return precioEntrada;
    }
}
