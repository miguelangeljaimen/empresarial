package cl.solemne.modelos;
// Generated 16-oct-2017 21:15:19 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ventas generated by hbm2java
 */
public class Ventas extends Modelo implements java.io.Serializable {


     private int id;
     private Usuarios usuarios;
     private Date fecha;
     private int idCliente;
     private Set<DetalleVenta> detalleVentas = new HashSet<DetalleVenta>(0);

    public Ventas() {
    }

	
    public Ventas(int id, Usuarios usuarios, Date fecha, int idCliente) {
        this.id = id;
        this.usuarios = usuarios;
        this.fecha = fecha;
        this.idCliente = idCliente;
    }
    public Ventas(int id, Usuarios usuarios, Date fecha, int idCliente, Set<DetalleVenta> detalleVentas) {
       this.id = id;
       this.usuarios = usuarios;
       this.fecha = fecha;
       this.idCliente = idCliente;
       this.detalleVentas = detalleVentas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public Set<DetalleVenta> getDetalleVentas() {
        return this.detalleVentas;
    }
    
    public void setDetalleVentas(Set<DetalleVenta> detalleVentas) {
        this.detalleVentas = detalleVentas;
    }




}


