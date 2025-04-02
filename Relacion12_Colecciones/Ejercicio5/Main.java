package Relacion12_Colecciones.Ejercicio5;

public class Main {
    

        public static void main(String[] args) {
    
            // Crear un pedido de tipo PIZZA
            Pedido pedido1 = new Pedido(TipoComida.PIZZA);
            pedido1.agregarIngrediente("Pepperoni");
            pedido1.agregarIngrediente("Champiñones");
            pedido1.mostrarPedido();
    
            // Crear un pedido de tipo HAMBURGUESA
            Pedido pedido2 = new Pedido(TipoComida.HAMBURGUESA);
            pedido2.agregarIngrediente("Queso");
            pedido2.mostrarPedido();
    
            // Crear un pedido de tipo ENSALADA
            Pedido pedido3 = new Pedido(TipoComida.ENSALADA);
            pedido3.mostrarPedido();
    
            // Crear un pedido de tipo PASTA
            Pedido pedido4 = new Pedido(TipoComida.PASTA);
            pedido4.agregarIngrediente("Albahaca");
            pedido4.mostrarPedido();
    
            // Mostrar el número total de pedidos realizados
            System.out.println("Número total de pedidos realizados: " + Pedido.getNumeroPedidos());
        }
 }