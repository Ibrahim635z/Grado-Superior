package POO.src.Relacion9_clases.Ejercicio4;

public class Crear_autobus {

    public static void main(String[] args) {
        
        Autobus autobus= new Autobus();

        int numeroPlazas= 50;
        autobus.setnumeroPlaza(numeroPlazas);

        System.out.printf("El autobus tiene: %d plazas", autobus.getnumeroPlaza());
        
    }
    
}
