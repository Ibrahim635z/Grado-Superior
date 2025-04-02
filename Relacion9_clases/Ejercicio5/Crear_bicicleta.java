package POO.src.Relacion9_clases.Ejercicio5;

public class Crear_bicicleta {
    public static void main(String[] args) {
        
        Bicicleta miBicicleta=new Bicicleta();

        System.out.printf("la bicicleta es de color %s %n",miBicicleta.getColor());
        System.out.printf("mi bicileta corre a %d %n",miBicicleta.getVelocidad());
        System.out.printf("mi bicicleta esta en la marcha %d  %n",miBicicleta.getMarcha());

        miBicicleta.setFrenar();
        System.out.printf("mi bicileta corre a %d %n",miBicicleta.getVelocidad());

    }
    
}
