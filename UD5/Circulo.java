package POO.src.UD5;

public class Circulo{
    //atributos
    int x;
    int y;
    int radio;

    //metodos
    int obtenerx(){
        return x;
    }
    int obtenery(){
        return y;
    }
    void establecerX(int vx){
        x=vx;
    }
    void establecerY(int vy){
        y=vy;
    }
    public static void main(String[] args) {
        
        Circulo circulo1= new Circulo();

        circulo1.establecerX(10);
        circulo1.establecerY(20);       
        
        System.out.println("El valor del atributo X es: " +circulo1.obtenerx());
        System.out.println("El valor del atributo Y es: " +circulo1.obtenery());

    }
}