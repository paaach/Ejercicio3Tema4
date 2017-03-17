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
    public Camion () 
    {
        super ();
    }
    
    public Camion ( int tara, String matricula, int alquiler_dias)
    {
      super ( tara, matricula, alquiler_dias);  
    }
    
    @Override
    public void Recibo ()
    {
        System.out.println("**********");
        System.out.println("**CAMION**");
        System.out.println("**********");
        super.Recibo();
    }
    
    @Override
    public double alquiler ( double importe_alquiler )
    {
        importe_alquiler = (this.getAlquiler_dias()*50+this.getTara()*20)+40;
        return importe_alquiler;
    }
}
