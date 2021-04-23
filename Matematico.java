
/**
 * La clase matematico es la segunda tarea.
 * 
 * @author (Lisandro Vargas Muñoz ) 
 * @version (22/04/2021)
 */
public class Matematico
{
    private String nombreMatematico;

    /**
     * Constructor para asignar el nombre
     */
    public Matematico(String nombre)
    {
        nombreMatematico = nombre;
    }

    /**
     * este metodo escoge el mayor de 3 numeros
     * el mediano
     * Y el menor
     */
    public String NumeroMayMedMen(int a, int b,int c)
    {
        String respuesta;
        if (a > b)
        {
            if (a > c)
            {
                respuesta = "El mayor es "+a+" \n";
                if (b > c)
                {
                    respuesta = respuesta + "El mediano es "+b+" \n";
                    respuesta = respuesta + "Y el menor es "+c+" \n";
                }
                else
                {
                    respuesta = respuesta + "El mediano es "+c+" \n";
                    respuesta = respuesta + "Y el menor es "+b+" \n";
                }
            }
            else
            {
                respuesta = "El mayor es "+c+" \n";
                respuesta = respuesta + "El mediano es "+a+" \n";
                respuesta = respuesta + "Y el menor es "+b+" \n";
            }
        }
        else
        {
            if (b > c)
            {
                respuesta = "El mayor es "+b+" \n";
                if (a > c)
                {
                    respuesta = respuesta + "El mediano es "+a+" \n";
                    respuesta = respuesta + "Y el menor es "+c+" \n";
                }
                else
                {
                    respuesta = respuesta + "El mediano es "+c+" \n";
                    respuesta = respuesta + "Y el menor es "+a+" \n";
                }
            }
            else
            {
                respuesta = "El mayor es "+c+" \n";
                respuesta = respuesta + "El mediano es "+b+" \n";
                respuesta = respuesta + "Y el menor es "+a+" \n";
            }
        }
        return respuesta;
    }
    
    /**
     * este metodo calcula area de un rectangulo
     */
    public double calcularArea(int b, int a)
    {
        double area;
        area = b*a;
        return area;
    }
    
    /**
     * este metodo calcula la distancia entre 2 puntos
     */
    public double distanciaDosPuntos(int x, int y,int i,int j)
    {
        double distancia;
        distancia = Math.sqrt(Math.pow(x-i,2)+ Math.pow(y-j,2));
        return distancia;
    } 
    
    /**
     * este metodo muestra el lugar en el que esta 
     * ubicado un punto en un plano cartesiano
     */
    public String cuadrante(int x, int y)
    {
        String cuadranteDelPunto;
        if (x > 0 && y > 0)
            cuadranteDelPunto = "Cuadrante 1 o Primer Cuadrante";
        else if (x == 0 && (y > 0 || y < 0))
            cuadranteDelPunto = "Eje X";
        else if (y == 0 && (x > 0 || x < 0))
            cuadranteDelPunto = "Eje Y";
        else if (x < 0 && y > 0)
            cuadranteDelPunto = "Cuadrante 2 o Segundo Cuadrante";
        else if (x < 0 && y < 0)
            cuadranteDelPunto = "Cuadrante 3 o Tercer Cuadrante";
        else if (x > 0 && y < 0)
            cuadranteDelPunto = "Cuadrante 4 o Cuarto Cuadrante";
        else
            cuadranteDelPunto = "Punto Central ";
        return cuadranteDelPunto;
    } 
    
}
