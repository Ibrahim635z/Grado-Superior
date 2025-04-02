package Examen.Ejercicio3;

public abstract class Comercial extends Vehiculo{
    private int cargaMax,totalComerciales=0;
    private double volumen;

    public Comercial(String matricula,String marca,String modelo,int cargaMax,double volumen){
        super(matricula, marca, modelo);
        this.cargaMax=cargaMax;
        this.volumen=volumen;
        totalComerciales++;
    }
    @Override
    public void devolver() {
        if (alquilado==true){
            alquilado=false;
            System.out.println("El vehiculo comercial se ha devuelto correctamente");
        }else{
            System.out.println("El vehiculo comercial ya ha sido devuelto");
        }
        
    }
    public void comercial(){

    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }
    public void setTotalComerciales(int totalComerciales) {
        this.totalComerciales = totalComerciales;
    }
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    public int getCargaMax() {
        return cargaMax;
    }
    public int getTotalComerciales() {
        return totalComerciales;
    }
    public double getVolumen() {
        return volumen;
    }
}
