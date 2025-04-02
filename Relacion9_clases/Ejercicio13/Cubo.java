package POO.src.Relacion9_clases.Ejercicio13;

public class Cubo {
    int cant_litros;
    int cap_max;
    int tiempo;

    public Cubo(int cap_max,int cant_litros){

        this.cap_max=cap_max;
        this.cant_litros=cant_litros;

    }
    @Override
    public String toString() {
        return "El cubo tiene " +cap_max+ " litros de capacidad y contiene " +cant_litros+ " litros";
    }


    public void RestaLitros(int litros){
        //poner que los litros no sean menores q 0 en caso de eso enviar mensaje
        if (cant_litros<litros){
            System.out.println("No puedes transferir " +litros+ " litros ya que el cubo solo tiene " +cant_litros+ " litros");
        }else{
            cant_litros-=litros;
        }
    }
    public void SumarLitros(int litros){
        //esto falla porque siempre entra cuando restamos por tanto suma dos veces si lo de arriba no se cumple
        if(cant_litros+litros>cap_max){
            System.out.println("No puedes transferir " +litros+ " litros ya que la capacidad maximo del cubo es de " +cap_max+ " litros");
        }else{
        cant_litros+=litros;
        }
    }
    
}
