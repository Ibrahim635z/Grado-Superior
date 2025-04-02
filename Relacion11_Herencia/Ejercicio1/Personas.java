package POO.src.Relacion11_Herencia.Ejercicio1;

public class Personas {

    String nif;
    int altura;
    int edad;

    public Personas(){
        nif="11111111A";
        altura=175;
        edad=25;

    }

    public Personas(String nif,int altura,int edad){
        this.nif=nif;
        this.altura=altura;
        this.edad=edad;

    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }
    public int getAltura() {
        return altura;
    }
    public int getEdad() {
        return edad;
    }
    public String getNif() {
        return nif;
    }

    public void hablar(){
            System.out.println("Hola, puedo hablar");
    }
    public void comer(){
        System.out.println("ñam ñam");
    }

    @Override
    public String toString() {
        return "PERSONA NIF: " +nif+" Altura: " +altura+ " Edad: " +edad;
    }
}
