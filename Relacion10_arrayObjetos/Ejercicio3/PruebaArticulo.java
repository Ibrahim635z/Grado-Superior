package POO.src.Relacion10_arrayObjetos.Ejercicio3;

import POO.src.Relacion10_arrayObjetos.Ejercicio2.Articulo;

public class PruebaArticulo {
    
   
    Articulo[] arrayArticulos;

    public PruebaArticulo(int tamaño){

        
        this.arrayArticulos=new Articulo[tamaño];

    }
  
    int cont=0;
    public boolean almacena(Articulo art){
        for (int i = 0; i < arrayArticulos.length; i++) {
            if(arrayArticulos[i]==null){
                arrayArticulos[i]=art;
                return true;
            }
        }
            return false;
        
    }

    @Override
    public String toString() {
        String cadena="";
        cadena+="Lista de Articulos: \n";
        for (int i = 0; i < arrayArticulos.length; i++) {
          cadena+=arrayArticulos[i]+ "\n";
          
        }
       
        return cadena;
    }
}
