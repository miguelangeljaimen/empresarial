package cl.solemne.modelos;
// Generated 16-oct-2017 21:15:19 by Hibernate Tools 4.3.1



/**
 * DetalleComboId generated by hbm2java
 */
public class DetalleComboId extends Modelo implements java.io.Serializable {


     private int id;
     private int productoId;

    public DetalleComboId() {
    }

    public DetalleComboId(int id, int productoId) {
       this.id = id;
       this.productoId = productoId;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getProductoId() {
        return this.productoId;
    }
    
    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DetalleComboId) ) return false;
		 DetalleComboId castOther = ( DetalleComboId ) other; 
         
		 return (this.getId()==castOther.getId())
 && (this.getProductoId()==castOther.getProductoId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getId();
         result = 37 * result + this.getProductoId();
         return result;
   }   


}


