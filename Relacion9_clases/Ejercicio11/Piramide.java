package POO.src.Relacion9_clases.Ejercicio11;

public class Piramide {
    private int altura;
    static int contadorPiramides=0;
    //Metodo constructor
    public Piramide(int altura){

        this.altura=altura;
        contadorPiramides++;
    }

    public static int getPirámidesCreadas() {
        return contadorPiramides;
    }
    @Override
    public String toString() {
        String cadena="";
        for (int i = 0; i < this.altura; i++) {
            // Imprimir espacios para centrar la pirámide
            for (int j = 0; j < this.altura - i - 1; j++) {
                cadena+=" ";
            }
        
            // Imprimir asteriscos
            for (int j = 0; j < 2 * i + 1; j++) {
                cadena+="*";
            }
        
            // Nueva línea para la siguiente fila
            cadena+="\n";
        }
        return cadena;
    

}
    

}
