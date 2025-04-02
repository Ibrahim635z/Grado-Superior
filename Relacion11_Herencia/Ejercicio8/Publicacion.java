package POO.src.Relacion11_Herencia.Ejercicio8;

public class Publicacion {
    String ISBN,titulo;
    int anio;

    public Publicacion(String ISBN, String titulo, int anio) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.anio = anio;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "ISBN: "+ ISBN+" Titulo: "+titulo+" Año: "+anio;
        }
}
