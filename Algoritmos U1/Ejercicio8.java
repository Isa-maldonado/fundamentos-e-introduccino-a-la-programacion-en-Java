
public class Ejercicio8
{
    double duracionMin = 2.5; //minutos
    double duracionMax = 3;   //minutos 
    int duracionVideo = 15;   //minutos
    
    public void calcularTiempo (){
        double maxCanciones = duracionVideo / duracionMin;
        System.out.println (maxCanciones + " canciones podrán ser parte del video, como máximo.");
    }
}
