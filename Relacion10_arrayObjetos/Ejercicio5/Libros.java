package POO.src.Relacion10_arrayObjetos.Ejercicio5;

public class Libros {
        
        String codigo;
        String titulo;
        String nombre,nacionalidad;
        Autores autor;
        public Libros(String codigo,String titulo,Autores autor){
            this.codigo=codigo;
            this.titulo=titulo;
            this.autor=autor;

        }


        @Override
        public String toString() {
       
        return "Codigo: " +codigo+ " Titulo:" +titulo+ " AUTOR --> " +autor;
        }

    
}
