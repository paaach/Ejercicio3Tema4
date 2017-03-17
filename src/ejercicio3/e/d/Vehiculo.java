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
public abstract class Vehiculo 
{
    //Variables que necesitamos
    private String matricula;
    private int alquiler_dias;
    
    //Constructor por defecto
    public Vehiculo()
    {
        matricula = "";
        alquiler_dias = 0;
    }
    
    //Constructor por defecto
    public Vehiculo(String matricula, int alquiler_dias) 
    {
        this.matricula = matricula;
        this.alquiler_dias = alquiler_dias;
    }
    
    //Metodos get y set

    public String getMatricula() 
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public int getAlquiler_dias()
    {
        return alquiler_dias;
    }

    public void setAlquiler_dias(int alquiler_dias) 
    {
        this.alquiler_dias = alquiler_dias;
    }
    
    //-----------Los metodos abstractos se implementan pero no se les hace nada
    //----------luego en la clase que los vayamos a usar los sobreescribimos
    
    //Metodo abstracto que devuelve un double segun el vehiculo
    public abstract double alquiler ( double importe_alquiler );
    
    //Metodo abstracto que muestra por pantalla por lo que le ponemos void por que no devuelve nada
    public abstract void Recibo();
    
    
    
    
}
