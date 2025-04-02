package POO.src.Relacion9_clases.Ejercicio11;

public class Rectangulo {
    int base;
    int altura;
    static int contadorRectangulos=0;
    public Rectangulo(int base, int altura){
        
        this.base=base;
        this.altura=altura;
        contadorRectangulos++;
    }

    @Override
    public String toString() {
        String cadena="";
        for (int i = 0; i < altura; i++) {  // filas
            for (int j = 0; j < base; j++) {  //  columnas
               cadena+="*";  // Imprime un asterisco sin salto de linea
            }
            cadena+="\n";  // Salto de linea despues de cada fila
        }
        return cadena;
    }
    void dibuja_rectangulo(){

      
    }
     public static int getRectángulosCreados() {
            return contadorRectangulos;
        }
        
}
