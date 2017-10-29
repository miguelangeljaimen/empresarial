package cl.solemne.modelos;
// Generated 16-oct-2017 21:15:19 by Hibernate Tools 4.3.1



/**
 * DetalleOCompra generated by hbm2java
 */
public class DetalleOCompra extends Modelo implements java.io.Serializable {


     private int id;
     private OrdenCompra ordenCompra;
     private Producto producto;
     private String cantidad;

    public DetalleOCompra() {
    }

    public DetalleOCompra(int id, OrdenCompra ordenCompra, Producto producto, String cantidad) {
       this.id = id;
       this.ordenCompra = ordenCompra;
       this.producto = producto;
       this.cantidad = cantidad;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public OrdenCompra getOrdenCompra() {
        return this.ordenCompra;
    }
    
    public void setOrdenCompra(OrdenCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public String getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }




}

