package cl.solemne.modelos;
// Generated 16-oct-2017 21:15:19 by Hibernate Tools 4.3.1



/**
 * Stock generated by hbm2java
 */
public class Stock  extends Modelo implements java.io.Serializable {


     private int id;
     private Producto producto;
     private int cantidad;

    public Stock() {
    }

    public Stock(int id, Producto producto, int cantidad) {
       this.id = id;
       this.producto = producto;
       this.cantidad = cantidad;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }




}


