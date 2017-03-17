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
    /**
     * Le damos valores por defecto para tenerlos inicializados
     */
    public Vehiculo()
    {
        matricula = "";
        alquiler_dias = 0;
    }
    
    //Constructor por parametros
    /**
     * 
     * @param matricula es la matricula de los vehiculos
     * @param alquiler_dias son los numeros de dias que tenemos en alquiler dicho vehiculo
     */
    public Vehiculo(String matricula, int alquiler_dias) 
    {
        this.matricula = matricula;
        this.alquiler_dias = alquiler_dias;
    }
    
    //Metodos get y set
    /**
     * 
     * @return nos devuelve ma matricula
     */
    public String getMatricula() 
    {
        return matricula;
    }
    /**
     * 
     * @param matricula le pasamos una matricula para poder tenerla en caso de que
     * queramos modificarla
     */
    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }
    /**
     * 
     * @return nps devuelve los dias que tenemos en alquiler el vehiculo
     */
    public int getAlquiler_dias()
    {
        return alquiler_dias;
    }
    /**
     * 
     * @param alquiler_dias se lo pasamos para poder modificarla posteriormente
     */
    public void setAlquiler_dias(int alquiler_dias) 
    {
        this.alquiler_dias = alquiler_dias;
    }
    
    //-----------Los metodos abstractos se implementan pero no se les hace nada
    //----------luego en la clase que los vayamos a usar los sobreescribimos
    
    //Metodo abstracto que devuelve un double segun el vehiculo
    public abstract double alquiler ();
    
    //Metodo abstracto que muestra por pantalla por lo que le ponemos void por que no devuelve nada
    public abstract void Recibo();
    
    
    
    
}
