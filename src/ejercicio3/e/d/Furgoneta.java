/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.e.d;

/**
 *
 * @author David
 */
public class Furgoneta extends VehiculoCarga
{
    //Constructor por defecto con los parametros del padre
    public Furgoneta ()
    {
      super ();  
    }
    
    //Constructor con parametros de la clase padre con los parametros del padre
    /**
     * 
     * @param tara cantidad de Kg que contratamos 
     * @param matricula matricula del vehiculo que vamos a contratar
     * @param alquiler_dias los dias que vamos a tener en alquiler el vehiculo
     */
    public Furgoneta ( int tara, String matricula, int alquiler_dias )
    {
        super ( tara, matricula, alquiler_dias);
    }
    
    //Metodo abstracto Recibo que sobreescribimos de la clase padre
    @Override
    /**
     * Metodo que nos da una informacion general de esta clase con el constructor
     * del padre
     */
    public void Recibo ()
    {
        System.out.println("***********");
        System.out.println("*FURGONETA*");
        System.out.println("***********");
        super.Recibo();
    }
    
    //Metodo abstracto alquiler que recibimos y sobreescribimos del padre
    
    @Override
    /**
     * Metodo que nos calcula el alquiler de una furgoneta devolviendotelo
     */
    public double alquiler ()
    {
        double importe_alquiler;
        importe_alquiler = this.getAlquiler_dias()*50+this.getTara()*20;
        return importe_alquiler;
    }
    
    

}
