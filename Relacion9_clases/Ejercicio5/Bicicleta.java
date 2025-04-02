package POO.src.Relacion9_clases.Ejercicio5;

public class Bicicleta {

    public String color="negro";
    public int velocidad=0,marcha=2;


    public String getColor() {
        return color;
    }
    public int getMarcha() {
        return marcha;
    }
    public int getVelocidad() {
        return velocidad;
    }
    
    void setCambiodeMArcha(){
        marcha++;
    }
    void setAvanzar(){
        velocidad++;
    }
    void setFrenar(){
        velocidad--;
    }
    
}
