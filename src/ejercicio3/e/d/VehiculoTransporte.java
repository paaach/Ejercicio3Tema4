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
public abstract class  VehiculoTransporte extends Vehiculo
{
    //Variables que necesitamos para esta clase.
    private int numero_plazas;
    
    //Construnctor por defecto que igualamos la la variable a si misma y llamamos al contructor por defecto del padre tambien.
    public VehiculoTransporte() 
    {
        super();
        numero_plazas = 0;
    }
    
    //Constructor por parametros que recible en los parametros tantos parametros como variables tenga tambien el padre puesto que hereda de el.
    public VehiculoTransporte(int numero_plazas, String matricula, int alquiler_dias) 
    {
        super(matricula, alquiler_dias);
        this.numero_plazas = numero_plazas;
    }

    //metodos get y set de la variable que hemos creado en este caso no hace falta hacer referencia a los del padre. 
    public int getNumero_plazas() 
    {
        return numero_plazas;
    }

    public void setNumero_plazas(int numero_plazas) 
    {
        this.numero_plazas = numero_plazas;
    }
    
    //Metodo abstracto que recibe un double pero como lo tenemos creado en el padre lo que hacemos es sobreescribirlo.
    @Override
    public abstract double alquiler ();
    
    //Metodo abstracto que sobreescribimos del padre que hacemos mostrar la informacion total.
    @Override
    public void Recibo ()
    {
        System.out.println("----------------------------------");
        System.out.println("Matricula : " + this.getMatricula());
        System.out.println("----------------------------------");
        System.out.println("Dias de alquiler : " + this.getAlquiler_dias());
        System.out.println("----------------------------------");
        System.out.println("Plazas alquiladas : " + this.getNumero_plazas());
        System.out.println("----------------------------------");

    }
    
    
    
    
    
}
