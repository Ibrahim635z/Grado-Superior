package POO.src.Relacion11_Herencia.Ejercicio3;

public class YogurDesnatado extends Yogur {
    
    public YogurDesnatado(){
        super();
        calorias=calorias/2;

    }
    @Override
    public String toString() {
        return "YogurDesnatado [calorias=" +calorias+" ]";
    }
}
