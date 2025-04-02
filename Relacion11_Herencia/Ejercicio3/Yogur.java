package POO.src.Relacion11_Herencia.Ejercicio3;

public class Yogur {
    double calorias=120.5;
    
    public double getcalorias(){
        return calorias;
    }
    @Override
    public String toString() {
        return "Yogur [calorias=" + calorias + "]";
    }
   
}
