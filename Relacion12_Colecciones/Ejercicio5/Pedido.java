package Relacion12_Colecciones.Ejercicio5;

import java.util.HashSet;

public class Pedido {
    static int NumeroPedidos;
    TipoComida tipo_comida;
    HashSet<String> ingredientes =new HashSet<>();

    public Pedido(TipoComida tipo_comida){
        this.tipo_comida=tipo_comida;
        NumeroPedidos++;
    }

    public void agregarIngrediente(String ingrediente){

        ingredientes.add(ingrediente);

    }

    public void mostrarPedido(){
        
        System.out.println(toString());
        
    }
    public static int getNumeroPedidos() {
        return NumeroPedidos;
    }

    @Override
    public String toString() {
        
        return "Pedido: " +tipo_comida+ "\nID del Pedido:" +NumeroPedidos+ "\nIngredientes extra: " +(ingredientes.isEmpty() ? "Ninguno" : ingredientes);
    }
}
