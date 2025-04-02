package POO.src.Relacion11_Herencia.Ejercicio8;

public class Revista  extends Publicacion implements Comparable<Revista> {
    int numero;
    public Revista(String ISBN,String titulo,int anio,int numero){
        super(ISBN,titulo,anio);
        this.numero = numero;
        
    }
}
