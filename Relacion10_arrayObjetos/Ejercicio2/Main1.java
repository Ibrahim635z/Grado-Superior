package POO.src.Relacion10_arrayObjetos.Ejercicio2;

public class Main1 {
    public static void main(String[] args) {
        
        Articulo art1 = new Articulo("A001", "Raqueta de tenis");
        Articulo art2 = new Articulo("A002", "Pelota de tenis");
        Articulo art3 = new Articulo("A003", "Pelota de fútbol");
        
        Articulo[] articulos_array = new Articulo[3];
        articulos_array[0] = art1;
        articulos_array[1] = art2;
        articulos_array[2] = art3;
        //forma foreach        
        for (Articulo articulo : articulos_array) {
            System.out.println(articulo);
        }
        //forma for normal
        for (int i = 0; i < articulos_array.length; i++) {
            System.out.println(articulos_array[i]);
        }
        
     

    }
}
