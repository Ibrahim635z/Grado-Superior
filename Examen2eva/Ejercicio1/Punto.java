package Examen.Ejercicio1;

public class Punto {
    double x,y;
    public Punto(double x,double y){
        this.x=x;
        this.y=y;
    }
   
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    @Override
    public String toString() {
        
        return "("+x+", "+y+")";
    }

}
