package POO.src.Relacion11_Herencia.Ejercicio7;

import POO.src.Relacion11_Herencia.Ejercicio9.Arrancable;

public class Coche extends Vehiculo implements Arrancable  {
    private String marca;
    boolean estado=false;

    public Coche(String marca) {
        super();
        this.marca = marca;
    }

    public void avanzarCoche(){
        if(this.estado==false){
            System.out.println("El coche está parado no puede avanzar");
        }else{
            System.out.println("El coche de la marca "+marca+" está avanzando");
        }
        
    }
    @Override
    public void hacerRuido() {
        if(this.estado==false){
            System.out.println("El coche está parado no puede hacer ruido");
        }else{
            System.out.println("Rum rum");
        }
        
    }

    public void quemarRueda() {
        if(this.estado==false){
            System.out.println("El coche está parado no puede derrapar");
        }else{
            System.out.println("Derrape!!");
        }
        
    }
  
    public void Arrancar() {  
        System.out.println("Acabas de arrancar el coche"); 
        this.estado=true;
    }
  
    public void Detener() {
        System.out.println("Acabas de apagar el coche");
        this.estado=false;
    }
   
    public void EstarArrancado() {
        if(this.estado==true){
            System.out.println("El coche está arrancado");
            }
            else{
                System.out.println("El coche esta apagado");
            
            }
    }
}
