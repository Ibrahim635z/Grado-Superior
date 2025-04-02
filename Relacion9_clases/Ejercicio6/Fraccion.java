package POO.src.Relacion9_clases.Ejercicio6;

public class Fraccion {

    // atributos de objetos
    int numerador,denominador;

    
    // metodos de clase
   
    static Fraccion MultiplicaFraccion(Fraccion f1,Fraccion f2){
        Fraccion resultado=new Fraccion();
        resultado.setFraccion(f1.getNumerador() * f2.getNumerador(),f1.getDenominador() * f2.getDenominador());
        return resultado;
    }

    static Fraccion divideFraccion(Fraccion f1, Fraccion f2){
        Fraccion resultado=new Fraccion();
        resultado.setFraccion(f1.getNumerador() * f2.getDenominador(), f1.getDenominador() * f2.getNumerador());
        return resultado;        
    }

    

    static Fraccion SimplificaFraccion(Fraccion f1,int mcd){
        Fraccion resultado=new Fraccion();
        
        resultado.setFraccion(f1.getNumerador()/mcd, f1.getDenominador()/mcd);
    
        return resultado;
    }

    
    // métodos de objeto
    void invierte(){
        int temp;

        temp = numerador;
        numerador = denominador;
        denominador = temp;
    }
    public  int MCD(Fraccion f1){
        int dividendo,divisor,resto;

        dividendo= Math.max(f1.getNumerador(),f1.getDenominador());
        divisor= Math.min(f1.getNumerador(),f1.getDenominador());
      

        if(dividendo%divisor==0){
           return divisor;
        }else{
            while(divisor!=0){
                resto=dividendo%divisor;
                dividendo=divisor;
                divisor=resto;
              
            }
           return dividendo;
        }
       
    }

    void setFraccion(int num,int den){
        numerador=num;
        denominador=den;
    }
    int getNumerador(){
        return numerador;
    }
    int getDenominador(){
        return denominador;
    }
    
   
}
