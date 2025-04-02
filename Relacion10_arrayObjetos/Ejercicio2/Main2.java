package POO.src.Relacion10_arrayObjetos.Ejercicio2;

public class Main2 {
    public static void main(String[] args) {
        Articulo[] arrayArticulo = new Articulo[3];
        
        arrayArticulo[0] = new Articulo("T001", "Teclado Logitech K860");
        arrayArticulo[1] = new Articulo("T002", "Ordenador Asus");
        arrayArticulo[2] = new Articulo("T003", "Monitor Asus");
        
        for (Articulo articulo : arrayArticulo) {
            System.out.println(articulo);
        }
    }
    
}
