package POO.src.Relacion9_clases.Ejercicio9;

public class Tiempo {
    
    int horas,minutos,segundos;

    public Tiempo(int horas,int minutos,int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
        AjustarTiempo();
    }
    public String toString(){
        
         return +this.horas+ " Horas " +this.minutos+ " Minutos " +this.segundos+" Segundos";
        
     }
     private void AjustarTiempo() {
        if (segundos >= 60) {
            minutos += segundos / 60;
            segundos %= 60;
        } else if (segundos < 0) {
            minutos -= (Math.abs(segundos)  / 60); 
            segundos = (Math.abs(segundos) % 60); 
        }

        if (minutos >= 60) {
            horas += minutos / 60;
            minutos %= 60;
        } else if (minutos < 0) {
            horas -= (Math.abs(minutos) / 60);
            minutos = (Math.abs(minutos) % 60);
        }

        if (horas > 24) {
            int dias=0;
            dias=dias + (horas/24); 
            horas = horas%24;
            System.out.println("Ha pasado " +dias+ " dias");
        }
        if(horas<0){
            horas=0;
        }
    }

    public void suma(Tiempo t){
        this.horas+=t.horas;
        this.minutos+=t.minutos;
        this.segundos+=t.segundos;
        
        AjustarTiempo();
      
       
    }

    public void resta(Tiempo t){
        this.horas-=t.horas;
        this.minutos-=t.minutos;
        this.segundos-=t.segundos;
        
        AjustarTiempo();
       
    }
}
