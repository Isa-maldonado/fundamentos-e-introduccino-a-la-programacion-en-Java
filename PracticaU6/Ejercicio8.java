public class Ejercicio8
{
    public int juntarDigitos (int numero){
        int res = 0;
        int divisor = 10;
        if (numero > 0){
            while (numero > 0){
                int primerDig = numero % divisor;
                divisor = divisor * 10;
                numero = numero / 10;
            }
            int ultimoDig = (numero % 10) * 10  + primerDig;
        }
        return res;
        //Entendi la logica pero no supe donde ubicar la linea 12 para que me de la respuesta jajs 
    }
}
