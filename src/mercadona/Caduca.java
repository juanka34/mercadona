/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadona;

/**
 *
 * @author esetio
 */
public class Caduca extends Producto{
    
   String fecha;

    public String getFecha() {
        return fecha;
    }
      public void mostrar(){
       System.out.println(this.fecha);
        super.mostrar();
   }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
