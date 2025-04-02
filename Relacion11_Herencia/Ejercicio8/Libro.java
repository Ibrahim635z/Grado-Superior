package POO.src.Relacion11_Herencia.Ejercicio8;

public class Libro extends Publicacion implements Prestable,Comparable<Libro> {
    boolean prestado;
    public Libro(String ISBN,String titulo,int anio){
        super(ISBN,titulo,anio);
        this.prestado=false;

    }

    @Override
    public void presta() {
        // TODO Auto-generated method stub
        this.prestado=true;
        
    }
    @Override
    public void devuelve() {
        // TODO Auto-generated method stub
        this.prestado=false;
    }
    @Override
    public boolean estaPrestado() {
        // TODO Auto-generated method stub
        return this.prestado;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
