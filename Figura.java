// Documentar
/** 
 * Esta clase es una super clase para representar las caracteristicas 
 * comunes de muchas figurasa.
 * 
 * @author Nancy Vazquez
 * @version 8 Sep 2017
 */

public class Figura
{
    protected float area;
    
    public Figura()
    {
        area=0;
    }
    
    public void calcularArea()
    {
        System.out.println("No se como calcular el area, no se de que figura se trata");
    }
    
    public void impirmirArea()
    {
        System.out.println(" El area de la figura es: +area");
    }
}
    