
/**
 * Esta clase representa un circulo con un radio.
 * 
 * @author Nancy Vazquez
 * @version 8 Sep 17
 */
public class Circulo extends Figura
{
    protected float radio;
    
    public Circulo(float unRadio)
    {
        radio=unRadio;
    }
    @Override // Con esto le avisas al compilador que te avise de la sobreescrituta
    
    public void calcularArea()
    {
        area= 3.14f * radio * radio;
    }
    
}