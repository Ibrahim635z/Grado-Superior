package Relacion12_Colecciones.EjercicioArrayList;

import java.util.ArrayList;

public class AlmArticulo {
    ArrayList<Articulo> articulos;
    public AlmArticulo(){
        articulos=new ArrayList<>();
    }
    public void almacena(Articulo nuevo_articulo){
        articulos.add(nuevo_articulo);
    }


}
