package POO.src.Relacion10_arrayObjetos.Ejercicio2;

import POO.src.Relacion10_arrayObjetos.Ejercicio3.PruebaArticulo;

public class Articulo {
    private String codigo,descripcion;
    private int precio_compra,precio_venta,stock;

    public Articulo(String codigo,String descripcion){
       
        this.codigo=codigo;
        this.descripcion=descripcion;

    }

    public void setPrecio_compra(int precio_compra) {
        this.precio_compra = precio_compra;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio_compra() {
        return precio_compra;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public int getStock() {
        return stock;
    }
    static Articulo[] almacen=new Articulo[20];
    public static void entradaAutomatizada(){
        
        almacen[0] = new Articulo("Z001", "Zapatillas Jordan");
        almacen[0].setStock(1);
        almacen[1] = new Articulo("Z002", "Cuadro Goya");
        almacen[1].setStock(1);
        almacen[2] = new Articulo("Z003", "Piscina Pequeña");
        almacen[2].setStock(1);
        almacen[3] = new Articulo("Z004", "Peluche Pikachu");
        almacen[3].setStock(1);
       
    }

    public static void lista(){
        for (int i = 0; i < almacen.length; i++) {
            if(almacen[i]!=null){
            System.out.println(almacen[i]+", stock: "+almacen[i].getStock());
            }
        }
    }

    public static int alta(Articulo art){
        
        for (int i = 0; i < almacen.length; i++) {
            if(almacen[i]==null){
                almacen[i]=art;
                return 0;
            }
        }
        return 0;
    }
    public static void baja(int num_articulo){
        almacen[num_articulo-1]=null;
    }
    public static void entradaMercancia(int art){
       
        int stock=almacen[art].getStock();
        stock++;
        almacen[art].setStock(stock);
    }
    public static void salidaMErcancia(int art){
        int stock=almacen[art].getStock();
        stock--;
        almacen[art].setStock(stock);
    }

   @Override
   public String toString() {
       return codigo+ ": " +descripcion;
   }

}
