package ejercicio3.e.d;


import ejercicio3.e.d.Datos;
import ejercicio3.e.d.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public final class Alquiler implements Datos
{
   
    
   private ArrayList<Vehiculo> pedido;
   Furgoneta f;
   Camion t;
   Coche c;
   Bus b;
   
   public Alquiler ()
   {
       Scanner teclado_String = new Scanner ( System.in );
       Scanner teclado_Int = new Scanner ( System.in );
       System.out.println("Dime el numero de vehiculos");
       int numero_vehiculos = teclado_Int.nextInt();
       ArrayList<Vehiculo> pedido = new ArrayList(numero_vehiculos);
       
       for (int i = 0; i < pedido.size(); i++) 
       {
           System.out.println("Intruduce el tipo de vehiculo");
           String tipo_vehiculo = teclado_String.nextLine();
           char letra = tipo_vehiculo.charAt(i);
           
           switch ( letra )
           {
               case 'c':
                   System.out.println("Introduce la matricula del vehiculo " + pedido.get (i));
                   String matricula1 = teclado_String.nextLine();
                   c.setMatricula(matricula1);
                   System.out.println("Introduce los dias que vas a estar de alquiler " + pedido.get(i));
                   int numero_dias1 = teclado_Int.nextInt();
                   c.setAlquiler_dias(numero_dias1);
                   System.out.println("Introduce el numero de plazas del vehiculo " + pedido.get(i));
                   int numero_plazas1 = teclado_Int.nextInt();
                   c.setNumero_plazas(numero_plazas1);
                   pedido.add(c);
                   
               case 'b':
                   System.out.println("Introduce la matricula del vehiculo " + pedido.get(i));
                   String matricula2 =  teclado_String.nextLine();
                   b.setMatricula(matricula2);
                   System.out.println("Introduce los dias que vas a estar de alquiler " + pedido.get(i));
                   int numero_dias2 = teclado_Int.nextInt();
                   b.setAlquiler_dias(numero_dias2);
                   System.out.println("Introduce el numero de plazas del vehiculo " + pedido.get(i));
                   int numero_plazas2 = teclado_Int.nextInt();
                   b.setNumero_plazas(numero_plazas2);
                   pedido.add(b);
                   
               case 'f':
                   System.out.println("Introduce la matricula del vehiculo " + pedido.get(i));
                   String matricula3 = teclado_String.nextLine();
                   f.setMatricula(matricula3);
                   System.out.println("Introduce los dias que vas a estar de alquiler " + pedido.get(i));
                   int numero_dias3 = teclado_Int.nextInt();
                   f.setAlquiler_dias(numero_dias3);
                   System.out.println("Introduce la cantidad en KG que vas a usar " + pedido.get(i));
                   int peso_furgoneta = teclado_Int.nextInt();
                   f.setTara(peso_furgoneta);
                   pedido.add(f);
                   
               case 't':
                   System.out.println("Introduce la matricula del vehiculo " + pedido.get(i));
                   String matricula4 = teclado_String.nextLine();
                   t.setMatricula(matricula4);
                   System.out.println("Introduce los dias que vas a estar de alquiler " + pedido.get(i));
                   int numero_dias4 = teclado_Int.nextInt();
                   t.setAlquiler_dias(numero_dias4);
                   System.out.println("Introduce la cantidad en KG que vas a usar " + pedido.get(i));
                   int peso_camion = teclado_Int.nextInt();
                   t.setTara(peso_camion);
                   pedido.add(t);    
           }
           
       }
   }
   
   public double ImporteTotal ( double importe )
   {
       for (int i = 0; i < pedido.size(); i++) 
       {
           importe += pedido.get(i).alquiler(importe);
       }
       
       return importe;
   }
   
   @Override
   public void mostrarDatos ()
   {
       System.out.println("Total del alquiler " + this.ImporteTotal(0));
       System.out.println("******************************************");
       System.out.println("*****************Detalle******************");
       System.out.println("******************************************");
       
       for (int i = 0; i < pedido.size(); i++)
       {
           System.out.println("Vehiculo " + pedido.get(i));
           System.out.println("Informacion del vehiculo ");
           pedido.get(i).Recibo();
       }
   }
   
   @Override
   public void imprimir ()
   {
       
   }
}
