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
public abstract class VehiculoCarga extends Vehiculo
{
    //Variables que necesitamos para esta clase 
    private int tara;
    
    //Constructor por defecto de esta clase tambien llamando a la del padre
    public VehiculoCarga()
    {
        super();
        tara = 0;
    }

    //Constructor por defecto con los parametros con lso del padre y los de esta clase
    public VehiculoCarga(int tara, String matricula, int alquiler_dias)
    {
        super(matricula, alquiler_dias);
        this.tara = tara;
    }
    
    //Metodos get y set para esta clase
    public int getTara()
    {
        return tara;
    }

    public void setTara(int tara) 
    {
        this.tara = tara;
    }
    
    //Metodo abstracto del vehiculo
    @Override
    public abstract double alquiler ( double importe_alquiler );
    
    //Metodo abstracto que muestra por pantalla la documentacion de la clase
    @Override
    public void Recibo ()
    {
        System.out.println("----------------------------------");
        System.out.println("Matricula : " + this.getMatricula());
        System.out.println("----------------------------------");
        System.out.println("Dias de alquiler : " + this.getAlquiler_dias());
        System.out.println("----------------------------------");
        System.out.println("Taras : " + this.getTara());
        System.out.println("----------------------------------");
        System.out.println("Importe : ");
    }
    
    
    
    
    
    
    
    
    
}
