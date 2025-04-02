package POO.src.Relacion9_clases.Ejercicio7;

public class Pizza {
    
    String sabor;
    String tamaño;
    String estado;

    static int servidas=0;
    static int pedidas=0;
    
    public Pizza(String sabor,String tamaño){
       this.sabor=sabor;
       this.tamaño=tamaño;
       pedidas++;
       estado="pedida";
    }

    void sirve(){
        if(estado.equals("pedida")){
            estado="servida";
            servidas++;
        }else{
            System.out.println("Esta pizza ya esta servida");
        }
       
    }
    public String getSabor(){
        return sabor;
    }
    public String gettamaño(){
        return tamaño;
    }
    public String toString(){
       // podria usarlo creando un string mensaje= "" y luego un return mensaje; 
        return "sabor:" +getSabor()+ " tamaño:" +gettamaño();
       
    }

    static int getTotalPedidas(){
        
        return pedidas;
    }
    static int getTotalServidas(){
        
        return servidas;
       
    }

   
}
