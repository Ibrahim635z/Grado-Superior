package Examen.Ejercicio3;

public class Furgo extends Comercial{

    private int nPlazas,totalFurgoneta=0,Kmlimite;
    private Boolean baca,puertaLateral;

    public Furgo(String matricula,String marca,String modelo,int cargaMax,double volumen,int nPlazas,Boolean baca,Boolean puertaLateral){
        super(matricula, marca, modelo,cargaMax,volumen);
        this.nPlazas=nPlazas;
        this.baca=baca;
        this.puertaLateral=puertaLateral;
        totalFurgoneta++;
    }
    @Override
    public void alquilar() {
        if(kmRecorridos>=2000){
            System.out.println("La furgo a superado su vida util y no se puede alquilar");
            kmRecorridos=2000;
        }else{
            if (alquilado==false){
                alquilado=true;
                System.out.println("La furgo se ha alquilado correctamente");
            }else{
                System.out.println("la furgo ya esta alquilada");
            }
        }
    }
    @Override
    public void devolver() {
       
        super.devolver();
        kmRecorridos=kmRecorridos+500;
    }
    @Override
    public String toString() {
        
        return "La furgo "+marca+" "+modelo+ " con matricula "+matricula+" con numero plazas maxima "+nPlazas+" y km recorridos:"+kmRecorridos+".";
    }

    public void setnPlazas(int nPlazas) {
        this.nPlazas = nPlazas;
    }
    public void setTotalFurgoneta(int totalFurgoneta) {
        this.totalFurgoneta = totalFurgoneta;
    }
    public void setKmlimite(int kmlimite) {
        this.Kmlimite = kmlimite;
    }
    public void setBaca(Boolean baca) {
        this.baca = baca;
    }
    public void setPuertaLateral(Boolean puertaLateral) {
        this.puertaLateral = puertaLateral;
    }
    public int getnPlazas() {
        return nPlazas;
    }
    public int getTotalFurgoneta() {
        return totalFurgoneta;
    }
    public Boolean getPuertaLateral() {
        return puertaLateral;
    }
    public int getKmlimite() {
        return Kmlimite;
    }
    public Boolean getBaca() {
        return baca;
    }
    
}
