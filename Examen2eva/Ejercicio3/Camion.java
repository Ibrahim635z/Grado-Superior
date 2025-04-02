package Examen.Ejercicio3;

public class Camion extends Comercial{
    private Boolean volquete,cerrado;
    private int totalCamiones=0,Kmlimite;

    public Camion(String matricula,String marca,String modelo,int cargaMax,double volumen){
        super(matricula, marca, modelo, cargaMax, volumen);
        totalCamiones++;
    }
    @Override
    public void alquilar() {
       
        if(kmRecorridos>=2500){
            System.out.println("El camion a superado su vida util y no se puede alquilar");
            kmRecorridos=2500;
        }else{
            if (alquilado==false){
                alquilado=true;
                System.out.println("El camion se ha alquilado correctamente");
            }else{
                System.out.println("El camion ya esta alquilado");
            }
        }
    
    }
    @Override
    public void devolver() {
       
        super.devolver();
        kmRecorridos=kmRecorridos+1000;
    }
    @Override
    public String toString() {
        return "El camion "+marca+" "+modelo+ " con matricula "+matricula+" y km recorridos:"+kmRecorridos+".";
    }
    public void setVolquete(Boolean volquete) {
        this.volquete = volquete;
    }
    public void setCerrado(Boolean cerrado) {
        this.cerrado = cerrado;
    }
    public void setKmlimite(int kmlimite) {
        this.Kmlimite = kmlimite;
    }
    public void setTotalCamiones(int totalCamiones) {
        this.totalCamiones = totalCamiones;
    }
    public Boolean getVolquete() {
        return volquete;
    }
    public int getTotalCamiones() {
        return totalCamiones;
    }
    public int getKmlimite() {
        return Kmlimite;
    }
    public Boolean getCerrado() {
        return cerrado;
    }
}
