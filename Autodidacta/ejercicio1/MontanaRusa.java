package POO.src.Autodidacta.ejercicio1;

public class MontanaRusa extends Atraccion{
    int tipo;

    public MontanaRusa(String nombre,float precioEntrada,int duracion){
        super(nombre,precioEntrada,duracion);
        
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    float calcularPrecioFinal(){
        if(tipo==1){
            precioEntrada=precioEntrada+2;
        }else{
        precioEntrada=precioEntrada-2;
        }
        return precioEntrada;
    }

}
