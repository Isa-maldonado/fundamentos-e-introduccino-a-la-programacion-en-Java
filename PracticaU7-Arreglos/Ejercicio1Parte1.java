public class Ejercicio1Parte1
{
    private int [] arreglo;
    private int mayor;
    private int menor;
    
    private void mayorMenor(){
        menor = arreglo [0];
        mayor = arreglo [0];
        for (int i = 1; i < arreglo.length; i++){
            if (arreglo[i] > mayor){
                mayor = arreglo [i];
            }
            if (arreglo[i] < menor){
                menor = arreglo [i];
            }
        }
    }
    
    public void vortice(){
        mayorMenor();
        
    }
}
