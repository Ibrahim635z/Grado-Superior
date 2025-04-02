package Examen.Ejercicio3;

public abstract class Vehiculo {
    protected String matricula,marca,modelo;
    protected int kmRecorridos;
    protected Boolean alquilado;
    private int total_vehiculo=0;

    public Vehiculo(String matricula,String marca,String modelo){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        kmRecorridos=0;
        total_vehiculo++;
        alquilado=false;
    }

    public abstract void alquilar();
        
      
    public abstract void devolver();

    public void estaAlquilado(){
        if(alquilado==true){
            System.out.println("el vehiculo esta alquilado");
        }else{
            System.out.println("el Vehiculo no esta alquilado");
        }
    }

    @Override
    public abstract String toString();
    public void setAlquilado(Boolean alquilado) {
        this.alquilado = alquilado;
    }

    
    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setTotal_vehiculo(int total_vehiculo) {
        this.total_vehiculo = total_vehiculo;
    }
    public Boolean getAlquilado() {
        return alquilado;
    }
    public int getKmRecorridos() {
        return kmRecorridos;
    }
    public String getMarca() {
        return marca;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public int getTotal_vehiculo() {
        return total_vehiculo;
    }

}
