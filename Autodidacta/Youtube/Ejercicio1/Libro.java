package Autodidacta.Youtube.Ejercicio1;

public class Libro {
    int ISBN;
    String titulo;
    int num_pag;
    String autor;
    Boolean prestado;

    public Libro(){

    }

    public Libro(int ISBN,String titulo,int num_pag,String autor,Boolean prestado){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.num_pag=num_pag;
        this.autor=autor;
        this.prestado=prestado;
    }

    public void prestar(Boolean prestado){
        if (this.prestado) {
            System.out.println("El libro esta ya prestado");
        } else {
            prestado=true;
            System.out.println("El libro se a prestado correctamente");
        }
    
    }

    public void imprimir(){

    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }
    public void setNum_pag(int num_pag) {
        this.num_pag = num_pag;
    }
    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }

    public int getISBN() {
        return ISBN;
    }
    public int getNum_pag() {
        return num_pag;
    }
    public Boolean getPrestado() {
        return prestado;
    }
    public String getTitulo() {
        return titulo;
    }

}
