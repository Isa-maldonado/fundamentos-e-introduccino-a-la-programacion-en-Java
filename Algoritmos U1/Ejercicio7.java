public class Ejercicio7
{
    //LA BATERIA
    int porcenConsumeJugar = 20;
    int porcenConsumeRedes = 10;
    int porcenConsumeYoutube = 15;
    int bateriaActual = 55;
    
    public void calcularBateria (){
        int jugar = (30 * porcenConsumeJugar) / 60;
        int revisarRedes = (15 * porcenConsumeRedes) / 60;
        int videosYoutube = (40 * porcenConsumeYoutube) / 60;
        
        int sumarConsumo = jugar + revisarRedes + videosYoutube;
        int bateriaRestante = bateriaActual - sumarConsumo;
        
        System.out.println ("Le quedará " + bateriaRestante + "% de batería disponible.");
    }
}