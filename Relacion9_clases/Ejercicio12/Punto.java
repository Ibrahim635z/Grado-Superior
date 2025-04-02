package POO.src.Relacion9_clases.Ejercicio12;

public class Punto {
    double coordenadaX,coordenadaY;

    public Punto(double coordenadaX,double coordenadaY){

        this.coordenadaX=coordenadaX;
        this.coordenadaY=coordenadaY;

    }
    @Override
    public String toString() {
        
        return "(" +coordenadaX+ "," +coordenadaY+ ")";
    }
    
}
