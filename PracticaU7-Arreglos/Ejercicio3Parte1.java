public class Ejercicio3Parte1
{
    private int [] arr;
    private int mitad1;
    private int mitad2;
    private int sumaMitad1;
    private int sumaMitad2;
    private int [] arreglo1;
    private int [] arreglo2;

    public Ejercicio3Parte1 (int [] arreglo){
        arr = arreglo;
        sumaMitad1 = 0;
        sumaMitad2 = 0;
    }

    private void numMitad (){
        int mitad = arr.length / 2;
        if(arr.length % 2 == 0){
            mitad1 = mitad;
            mitad2 = mitad;
        }else {
            mitad1 = mitad;
            mitad2 = mitad + 1;
        }
    }

    private void dividirArreglos (){
        arreglo1 = new int [mitad1];
        arreglo2 = new int [mitad2];
        int contador = 0;
        for (int i = 0; i < mitad1; i++){
            arreglo1 [i] = arr[i];
        }
        for (int i = mitad1; i < arr.length; i++){
            arreglo2 [contador] = arr[i];
            contador++;
        }
    }

    private void sumarArreglo (){
        for (int i = 0; i < mitad1 ; i++){
            sumaMitad1 = sumaMitad1 + arreglo1 [i]; 
        }
        for (int i = 0 ; i < mitad2 ; i++){
            sumaMitad2 = sumaMitad2 + arreglo2 [i]; 
        }
    }

    public int numDesequilibrio (){
        numMitad();
        dividirArreglos();
        sumarArreglo();
        int res = 0;
        while(arr.length > 1){
            if(sumaMitad1 > sumaMitad2){
                arr = arreglo1;
                numMitad();
                dividirArreglos();
                sumaMitad1 = 0;
                sumaMitad2 = 0;
                sumarArreglo();
            }else if (sumaMitad2 > sumaMitad1){
                arr = arreglo2;
                numMitad();
                dividirArreglos();
                sumaMitad1 = 0;
                sumaMitad2 = 0;
                sumarArreglo();
            }else if(sumaMitad1 == sumaMitad2){
                System.out.println ("La suma de los arreglos es igual, por lo tanto esta en equilibrio");
            }
        }
        if (sumaMitad1 > sumaMitad2){
            res = sumaMitad1;
        }else if(sumaMitad2 > sumaMitad1){
            res = sumaMitad2;
        }else {
            System.out.println ("Son iguales :)");
        }
        return res;
    }
}