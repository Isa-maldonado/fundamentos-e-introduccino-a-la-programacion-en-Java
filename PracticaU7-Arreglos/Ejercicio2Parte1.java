public class Ejercicio2Parte1
{
    private int niveles [];
    private int pares;
    private int impares;

    public Ejercicio2Parte1 (int [] arreglo){
        niveles = arreglo;
    } 

    public void ordenar (){
        for (int i = 0; i < niveles.length -1; i++){
            for (int j = i +1; j < niveles.length; j++){
                if (niveles[i] % 2 != 0){
                    if(niveles[i] > niveles[j] && niveles[j] % 2 != 0){
                        int aux = niveles[i];
                        niveles[i] = niveles[j];
                        niveles[j] = aux;
                    }
                }else{
                    if(niveles[j] % 2 != 0){
                        int aux = niveles[i];
                        niveles[i] = niveles[j];
                        niveles[j] = aux;
                    }
                }
            }
            for (int j = niveles.length -1-i; j >= 0; j--){
                int posAux = niveles.length -1-i;
                if (niveles[posAux] % 2 == 0){
                    if(niveles[posAux] > niveles[j] && niveles[j] % 2 == 0){
                        int aux = niveles[posAux];
                        niveles[posAux] = niveles[j];
                        niveles[j] = aux;
                    }
                }else{
                    if(niveles[j] % 2 == 0){
                        int aux = niveles[posAux];
                        niveles[posAux] = niveles[j];
                        niveles[j] = aux;
                    }
                }
            }
        }
    }
}
