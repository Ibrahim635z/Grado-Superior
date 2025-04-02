package POO.src.Relacion9_clases.Ejercicio10;

public class Incidencia {

    int numero,puesto;
    String tipo,estado,solucion;

    //atributo de clase suelen ir estaticos
    static int pendiente=0;
   
    public Incidencia(int numero,String tipo){
    
        this.numero=numero;
        this.tipo=tipo;
        pendiente++;
        estado="pendiente";
       
    }
    public Incidencia(String tipo){
        this.numero=(int)(Math.random()*999);
        estado="pendiente";
        pendiente++;
    }
    public void resuelve(String solucion){
        
        this.solucion=solucion;
        estado="resuelta";
        pendiente--;
    }
    public String toString(){
        // podria usarlo creando un string mensaje= "" y luego un return mensaje; 
        if(this.estado.equals("pendiente")){
            return "incidencia numero: "+numero+" - "+tipo+ " - " +estado;
        }else{
         return "incidencia numero: "+numero+" - "+tipo+ " - " +estado+ " - "+solucion;
        }
     }

    public void setPendientes(){
       
        if(estado.equals("pendiente")){
            pendiente++;
        }
       
    }
     static int getPendientes(){
        
        return pendiente;
    }
}

