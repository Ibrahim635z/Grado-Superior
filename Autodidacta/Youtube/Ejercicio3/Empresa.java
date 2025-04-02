package Autodidacta.Youtube.Ejercicio3;

public class Empresa {
    private String CIF,nombre;
   

    public Empresa(String CIF,String nombre){
        this.CIF=CIF;
        this.nombre=nombre;
    }
    public void setCIF(String cIF) {
        CIF = cIF;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCIF() {
        return CIF;
    }
    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        
        return "CIF: "+CIF+" Noombre: "+nombre+"";
    }
}
