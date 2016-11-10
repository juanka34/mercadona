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
public class Alcoholica extends Bebida{
    
    private int grados;
    
     public void mostrar(){
      super.mostrar();
        System.out.println(this.grados);
 
   }

    public int getGrados() {
        return grados;
    }

    public void setGrados(int grados) {
        this.grados = grados;
    }
    
}
