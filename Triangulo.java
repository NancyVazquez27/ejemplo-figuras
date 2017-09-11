/**
 * Esta clase pertenece ala Figura Triangulo la cual es representativa
 * de las caracteristicas del mismo.
 * 
 * @author Nancy Vazquez.
 * @version 10 Sep 17
 * 
 */

public class Triangulo extends Figura
{
    protected float base;
    protected float altura;
    
    public Triangulo(float unBase,float unAltura)
    {
        base=unBase;
        altura=unAltura;
    }
    
    @Override
    
    public void calcularArea()
    {
        area=(base*altura)/2f;
    }
    
}
