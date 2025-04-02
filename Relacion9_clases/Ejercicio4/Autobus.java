package POO.src.Relacion9_clases.Ejercicio4;

public class Autobus {
    
    String matricula;
    String modelo;
    int potenciaCV;
    int numeroPlazas;

    public void setnumeroPlaza(int plazas){

        numeroPlazas=plazas;
    }
    
    public String getMatricula(){
        return matricula;
    }
    public String getModelo(){
        return modelo;
    }
    public int getpotenciaCV(){
        return potenciaCV;
    }
    public int getnumeroPlaza(){
        return numeroPlazas;
    }

}
