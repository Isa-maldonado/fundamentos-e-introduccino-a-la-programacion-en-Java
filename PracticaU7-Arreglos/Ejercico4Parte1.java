public class Ejercico4Parte1
{
    private int [] arr;
    private int index;
    //private int nuevoArreglo;
    
    //Falla a ratos xd
    
    public Ejercico4Parte1 (int [] arreglo){
        arr = arreglo;
        index = 0;
    }
    
    public String encontrarEstrellas (int inicio, int fin){
        String res = "";
        arr [0] = inicio;
        arr [fin] = fin;
        for (int i = 0; i <= fin; i++){
            if(arr[i] == 0){
                index++;  
                res = "Hay " + index+ "estrella(s) que han dejado de brillar"; 
            }
        }
        return res;
    }
}
