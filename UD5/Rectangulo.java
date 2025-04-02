package POO.src.UD5;

public class Rectangulo {
    public double x1,y1; //vertice inferior izquierdo
    public double x2,y2; // vertice superior derecho
    private String nombre;// nombre del rectangulo

    //stati final no se puede modificar y static si se puede modificar en otra clase

    private static int numRectangulos; // nombre total de rectangulos creados
    public static final String nombreFigura = "Rectangulo"; // mp,nre de ñacñase
    public static final double PI=3.1416; //constante pi

    int getnumeroRectangulos(){
        return numRectangulos;
    }
    String getnombreFigura(){
        return nombreFigura;
    }

    double getPI(){
        return PI;
    }
    

}
