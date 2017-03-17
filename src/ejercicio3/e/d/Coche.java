package ejercicio3.e.d;


import ejercicio3.e.d.VehiculoTransporte;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Coche extends VehiculoTransporte
{
    //Constructor por defecto heredado del padre
    public Coche() 
    {
        super ();
    }
    
    //Constructor por parametros herredado de la clase que extiende
    public Coche(int numero_plazas, String matricula, int alquiler_dias)
    {
        super(numero_plazas, matricula, alquiler_dias);
    }
    
    //Sobrecarga del metodo Recibo 
    @Override
    /**
     * Metodo que nos da una informacion general de la clase
     */
    public void Recibo ()
    {
        System.out.println("**********");
        System.out.println("**Coche***");
        System.out.println("**********");
        super.Recibo();
        System.out.println("Importe :" + this.alquiler());
    }
    
    //Metodo alquiler sobrecargado, devolviendo el precio final que se cobra por el coche
    @Override
    /**
     * Metodo que nos calcula el costo de alquilar este vehiculo
     */
    public double alquiler() 
    {
        double importe_alquiler;
        importe_alquiler = this.getAlquiler_dias() * 50 + this.getNumero_plazas() * 1.5;
        return importe_alquiler;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
