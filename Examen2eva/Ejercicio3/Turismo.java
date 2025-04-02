package Examen.Ejercicio3;

public class Turismo extends Vehiculo {
    protected String color;
    private int nPlazas,nPuertas,totalTurismos,Kmlimite;
  
    
    public Turismo(String matricula,String marca,String modelo,String color){
        super(matricula, marca, modelo);
        totalTurismos++;
       this.color=color;
    }
    @Override
    public void alquilar() {
        
        if(kmRecorridos>=1000){
            System.out.println("El turismo a superado su vida util y no se puede alquilar");
            kmRecorridos=1000;
        }else{
            if (alquilado==false){
                alquilado=true;
                System.out.println("El turismo se ha alquilado correctamente");
            }else{
                System.out.println("El turismo ya esta alquilado");
            } 
        }
    }

    @Override
    public void devolver() {
        if (alquilado==true){
            alquilado=false;
            System.out.println("El Turismo se ha devuelto correctamente");
        }else{
            System.out.println("El Turismo ya ha sido devuelto");
        }
        kmRecorridos=kmRecorridos+100;
    }

    @Override
    public String toString() {
        
        return "El turismo "+marca+" "+modelo+ " con matricula "+matricula+" de color" +color+" y km recorridos:"+kmRecorridos+".";
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setnPlazas(int nPlazas) {
        this.nPlazas = nPlazas;
    }
    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }
    public void setTotalTurismos(int totalTurismos) {
        this.totalTurismos = totalTurismos;
    }
    public void setKmlimite(int kmlimite) {
        this.Kmlimite = kmlimite;
    }
    public String getColor() {
        return color;
    }
    public int getnPlazas() {
        return nPlazas;
    }
    public int getnPuertas() {
        return nPuertas;
    }
    public int getTotalTurismos() {
        return totalTurismos;
    }
    public int getKmlimite() {
        return Kmlimite;
    }
}
