package POO.src.Relacion11_Herencia.Ejercicio7;

public class Bicicleta extends Vehiculo {
    private String tipo;

    public Bicicleta(String tipo) {
        super();
        this.tipo = tipo;
    }
    public void avanzarBicileta(){
        System.out.println("La bicicleta "+tipo+ " avanza!!");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Ring ring !");
    }

    public void hacerCaballito() {
        System.out.println("Caballito!!");
    }
}
