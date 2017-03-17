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
public class Bus extends VehiculoTransporte
{
    //Constructor por defecto con los parametros del padre
 
    public Bus ()
    {
        super ();
    }
    
    //Constructor con parametros con los parametros del padre
    /**
     * 
     * @param numero_plazas son el numero de plazas de este vehiculo que herada del padre
     * @param matricula es la matricula del vehiculo que herada del padre
     * @param alquiler_dias son los dias en los qu el vehiculo esta de alquiler
     */
    public Bus(int numero_plazas, String matricula, int alquiler_dias) 
    {
        super(numero_plazas, matricula, alquiler_dias);
    }
    
    //Metodo recibo con los nuevos parametros y los del padre sobreescritos
    @Override
    /**
     * Nos da una explicacion del en este caso Bus
     */
    public void Recibo ()
    {
        System.out.println("**********");
        System.out.println("****Bus***");
        System.out.println("**********");
        super.Recibo();
    }
    
    //Metodo alquiler que nos devuelve el resultado de la cuenta hecha para calcular el precio del bus
    @Override
    /**
     * Calculamos lo que cuesta alquilar el bus
     */
    public double alquiler ()
    {
        double importe_alquiler;
        importe_alquiler = this.getAlquiler_dias()*50+this.getNumero_plazas()*3.5;
        
        return importe_alquiler;
    }

}
