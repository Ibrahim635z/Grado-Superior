package Relacion12_Colecciones.EjercicioArrayList;

public class Articulo {
    int codigo,stock;
    double precio_compra,precio_venta;
    String descripcion;

    public Articulo(int codigo,String descripcion){
        this.codigo=codigo;
        this.descripcion=descripcion;
    }
    public Articulo(int codigo, String descripcion, int stock, double precio_compra, double precio_venta) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }
    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getPrecio_compra() {
        return precio_compra;
    }
    public double getPrecio_venta() {
        return precio_venta;
    }
    public int getStock() {
        return stock;
    }
  
    public String toString() {
        return "Código: " + codigo +
               ", Descripción: " + descripcion +
               ", Stock: " + stock +
               ", Precio Compra: " + precio_compra +
               ", Precio Venta: " + precio_venta;
    }
}
