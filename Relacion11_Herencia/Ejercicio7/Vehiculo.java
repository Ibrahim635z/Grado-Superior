package POO.src.Relacion11_Herencia.Ejercicio7;

public abstract class Vehiculo {
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;
    private int kilometrosRecorridos;
    public Vehiculo() {
        this.kilometrosRecorridos = 0;
        vehiculosCreados++;
    }

    public int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public abstract void hacerRuido();

}
