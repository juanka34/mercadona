/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadona;

import java.util.ArrayList;

/**
 *
 * @author esetio
 */
public class Mercadona {

    static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    static ArrayList<Producto> productos = new ArrayList<Producto>();

    public static void rellenardatos() {

        Empleado emp;
        for (int i = 0; i < 10; i++) {//empleados
            emp = new Empleado();
            emp.setEdad(i);
            emp.setNombre("empleado" + i);
            empleados.add(emp);

        }
        Producto p;
        for (int i = 0; i < 10; i++) {

            p = new Producto();
            p.setCodigo(i + 10);
            p.setPeso(i);
            p.setNombre("manteca");
            productos.add(p);

            Caduca c = new Caduca();//productos caducan
            c.setCodigo(200 + i);
            c.setFecha("123456" + i);
            c.setNombre("caduca");
            c.setPeso(1+i);
            productos.add(c);

            Fresco f = new Fresco();//productos frescos
            f.setCodigo(100 + i);
            f.setFecha("3456789" + i);
            f.setTemperatura(i + 3);
            productos.add(f);

            Bebida b = new Bebida();
            b.setFecha("000000" + i);
            b.setCodigo(12 + i);
            b.setAzucar("sin azucar" + i);
            productos.add(b);

            Alcoholica al = new Alcoholica();
            al.setGrados(i + 47);
            al.setCodigo(1 + i);
            al.setFecha("111111" + i);
            al.setAzucar("con mucha azucar" + i);
            productos.add(al);

        }

    }

    public static void mostrarTodasBebidas() {

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Bebida) {

                System.out.println(productos.get(i).getCodigo());
            }

        }

    }

    public static void mostarTodosLosProductos() {
        for (Producto producto : productos) {
            producto.mostrar();
            
            System.out.println();

        }

    }

    public static void mostrarAzucarDeTodasLasBebidas() {

        for (int i = 0; i < productos.size(); i++) {

            if (productos.get(i) instanceof Bebida) {
                System.out.println(((Bebida) productos.get(i)).getAzucar());

            }
        }

    }

    public static void mostarAzucarBebidasNoAlcoholicas() {

        for (int i = 0; i < productos.size(); i++) {

            if (productos.get(i) instanceof Bebida) {
                if (productos.get(i) instanceof Alcoholica) {

                    System.out.println(((Bebida) productos.get(i)).getAzucar());

                }
            }

        }

    }

    public static void mostar() {
        
        
        
        
        

    }

    public static void mostarMediaDeGraduacion() {
        double media =0;
        double suma =0;
        int elementos = 0;

        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i)instanceof Alcoholica){
                suma=suma+((Alcoholica)productos.get(i)).getGrados();
                             
               elementos++;
                        
            }
            
            System.out.println(media);
        }

    }

    public static void main(String[] args) {
        
        
        
        

        //rellenardatos();
       //mostarTodosLosProductos();
        //mostrarTodasBebidas();
         mostarMediaDeGraduacion();
        
    }
}
