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
public class Bebida extends Caduca{
   private String azucar;
    
     public void mostrar(){
       super.mostrar();
         System.out.println(this.fecha);
   }

    public String getAzucar() {
        return azucar;
    }

    public void setAzucar(String azucar) {
        this.azucar = azucar;
    }
}
