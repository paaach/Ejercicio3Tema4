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
public class Camion extends VehiculoCarga
{
    /**
     * Constructo por defecto que nos coge los parametros del padre
     */
    public Camion () 
    {
        super ();
    }
    
    /**
     * Constructor por parametros con los parametros del padre
     * @param tara nos da la cantidad de Kg que tienen contratados que viene del padre
     * @param matricula nos da la matricula del vehiculo que estamos alquilando
     * @param alquiler_dias nos dice los dias que tenemos alquilados el vehiculo
     */
    public Camion ( int tara, String matricula, int alquiler_dias)
    {
      super ( tara, matricula, alquiler_dias);  
    }
    
    @Override
    /**
     * Metodo que nos da una informacion general del vehiculo
     */
    public void Recibo ()
    {
        System.out.println("**********");
        System.out.println("**CAMION**");
        System.out.println("**********");
        super.Recibo();
    }
    
    @Override
    /**
     * Metodo que nos calcula lo que cuesta alquilar este vehiculo y nos lo devuelve
     */
    public double alquiler ()
    {
        double importe_alquiler;
        importe_alquiler = (this.getAlquiler_dias()*50+this.getTara()*20)+40;
        return importe_alquiler;
    }
}
