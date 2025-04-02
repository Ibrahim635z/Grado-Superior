package Relacion12_Colecciones.EjercicioArrayList;

import java.util.ArrayList;

public class GestSimAlm {
    

    
    ArrayList<Articulo> almacen;

    public GestSimAlm(){
        almacen=new ArrayList<>();
    }

    public void entradaAutomatizada(){
        Articulo art1=new Articulo(001, "collar de oro", 5, 300, 350);
        Articulo art2=new Articulo(002, "patinete", 5, 100, 150);
        Articulo art3=new Articulo(003, "ordenador", 10, 900, 1050);
        Articulo art4=new Articulo(004, "cubiertos", 15, 20, 50);

        almacen.add(art1);
        almacen.add(art2);
        almacen.add(art3);
        almacen.add(art4);


    }
    public void lista(){
        for (int i = 0; i < almacen.size(); i++) {
            System.out.println(almacen.get(i));
        }
    }

    public void alta(Articulo a){
        almacen.add(a);
        System.out.println("Articulo añadido correctamente");
    }
    public void baja(Articulo a){
        almacen.remove(a);
        System.out.println("Articulo eliminado correctamente");
    }
    public void entradaMercancia(Articulo a,int cantidad){
        a.setStock(cantidad+a.getStock());
    }
    public void salidaMercancia(Articulo a,int cantidad){
        if(cantidad-a.getStock()>=0){
        a.setStock(cantidad-a.getStock());
        } else{
            System.out.println("No hay suficiente stock");
        }
    }

}
